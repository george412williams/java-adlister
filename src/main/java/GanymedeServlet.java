import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(name = "GanymedeServlet", urlPatterns = "/ganymede")
public class GanymedeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Ganymede!</h1>");
        //this is more of a placeholder, these 3 lines, of what can normally go there
            //intellij will auto complete with a throws servlet exception

    }
}
