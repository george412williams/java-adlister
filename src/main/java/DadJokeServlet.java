import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "DadJokeServlet", urlPatterns = "/dadjoke")
public class DadJokeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // now can write a response, need to capture a param so set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // getting a passed param so
        String joke = request.getParameter("joke");
        // default for blank parameter
        if(joke == null){
            joke = "hungry";
        }

        out.println("<hi> Hi " + joke + ", I'm Dad!</h1>");

    }

}
