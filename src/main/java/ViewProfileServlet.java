import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        request.getSession().getAttribute("loggedIn");

        String username = request.getParameter("username");
        String password = request.getParameter("password");


//        String validator = request.getAttribute(String loggedIn);
        String validUser = (String) session.getAttribute("loggedIn");

        if (validUser != null) {
            session.setAttribute("loggedIn", true);
            response.sendRedirect("/profile");
            System.out.println(session.getAttribute("loggedIn"));
        } else {
            response.sendRedirect("/login");
        }
    }
}
