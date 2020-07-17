import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
        DaoFactory.getAdsDao().all();
        request.setAttribute("all", DaoFactory.getAdsDao().all());
//        request.getRequestDispatcher("../webapp/index.jsp").forward(request,response);
    }


    //test
    public static void main(String[] args) {
        System.out.println(DaoFactory.getAdsDao().all());
    }
}
