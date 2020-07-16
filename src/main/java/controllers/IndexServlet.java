package controllers;


import models.DaoFactory;
import models.McBurgers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    // doGet next


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get all burgers that exist currently, and list them here,
        // w links to their indiv product page
        McBurgers burgerDao = DaoFactory.getMcBurgersDao();

        // find the burgers, 1 by 1, and add them to an arraylist, to se to the jsp
        List<models.McBurger> allBurgers = new ArrayList<>();
        allBurgers.add(burgerDao.findById(1));
        allBurgers.add(burgerDao.findById(2));
        allBurgers.add(burgerDao.findById(3));

        // start type out doget, by dog hit tab for auto:
        //super.doGet(req, resp);

        req.setAttribute("allBurgers", allBurgers);
        req.getRequestDispatcher("WEB-INF/view/index.jsp").forward(req,resp);

    }
}
