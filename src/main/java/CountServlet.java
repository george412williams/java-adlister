import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

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

        PrintWriter out = response.getWriter();
        out.println();
    }
}
