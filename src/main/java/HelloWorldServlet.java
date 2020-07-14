import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        if(name == null){
            name = "World";
        }
        String content = "<h1>Hello, " + name + "!";

        PrintWriter out = response.getWriter();
        out.println(content);

        // Bonus
        //
        // Make the page say "Hello, <name>!"
        // if name is passed as part of the query string
        // (e.g. /hello?name=codeup),
        // otherwise default to "Hello, World!".

        //test - works
        //http://localhost:8080/hello?name=bill
    }
}
