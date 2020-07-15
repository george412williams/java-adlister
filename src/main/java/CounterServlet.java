import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    int pageVisit;
    //String reset;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        //Create a page that displays a number that goes up
        // by one every time the /count page is viewed.
        //
        //Bonus
        //
        //Allow the user to pass a parameter in the query
        // string to reset the counter.

        String reset = request.getParameter("reset");
        if (reset == "yes"){
            pageVisit = 1;
        } else {
            pageVisit++;
        }

        //pageVisit++;

        PrintWriter out = response.getWriter();
        out.println("Page Visits: " + pageVisit);
    }
}