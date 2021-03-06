package PresentationLayer;

import DBAccess.ToppingMapper;
import FunctionLayer.Cupcake;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Topping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kurv extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException, ClassNotFoundException {

     // Fang topping parameter:
        HttpSession session = request.getSession();

        // ToppingID:
        int toppingID = 0;
        toppingID = Integer.parseInt(request.getParameter("topping"));
        session.setAttribute("topping", toppingID);

        // BottomID:
        int bottomID = 0;
        bottomID = Integer.parseInt(request.getParameter("bottom"));
        session.setAttribute("bottom", bottomID);

        // Quantity (antal):
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        session.setAttribute("quantity", quantity);

        String toppingName = request.getParameter("topping");
        String bottomName = request.getParameter("bottom");
        double toppingPrice = Double.parseDouble(request.getParameter("toppingPrice"));
        double bottomPrice = Double.parseDouble(request.getParameter("bottomPrice"));

        Cupcake cupcake = new Cupcake(toppingName, bottomName, toppingPrice, bottomPrice);




        // Sum:
<<<<<<< HEAD
        double toppingPrice = 0;
        toppingPrice = Double.parseDouble(request.getParameter("price"));
        double bottomPrice = 0;
        bottomPrice = Double.parseDouble(request.getParameter("price"));
=======

>>>>>>> d508095dbe4d3f572e2fae1131c1fdbc7d399714

        double sum = UtilClass.Sum.beregnSummen(toppingPrice, bottomPrice, quantity);
        session.setAttribute("sum", sum);
        System.out.println(toppingPrice);
        System.out.println(bottomPrice);
        System.out.println(quantity);
        System.out.println(sum);

        //LogicFacade.insertOrdre(quantity, sum, toppingValue, bottomValue);

        return "kurv";
    }
}
