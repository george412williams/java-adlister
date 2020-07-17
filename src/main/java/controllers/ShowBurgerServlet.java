package controllers;


import models.DaoFactory;
import models.McBurger;
import models.McBurgers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowBurgerServlet", urlPatterns = "/burgers/show")
public class ShowBurgerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // check for the burger ID attrib in the URL
        long burgerId = Long.parseLong(req.getParameter("id"));

        // create a connection to the daofactory
        McBurgers burgerDao = DaoFactory.getMcBurgersDao();

        // get the burger by its id, using findbyid
        McBurger thisBurger = burgerDao.findById(burgerId);

        //send that burger back to the jsp
        req.setAttribute("burger", thisBurger);

        req.getRequestDispatcher("../webapp/burgers-show.jsp").forward(req,resp);

    }
}
