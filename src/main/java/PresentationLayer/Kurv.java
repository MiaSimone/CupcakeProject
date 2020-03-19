package PresentationLayer;

import DBAccess.ToppingMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Topping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

public class Kurv extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException, ClassNotFoundException {

     // Fang topping parameter:
        HttpSession session = request.getSession();

        // ToppingID:
        int toppingID = 0;
        toppingID = Integer.parseInt(request.getParameter("topping"));
        session.setAttribute("toppingID", toppingID);

        // BottomID:
        int bottomID = 0;
        bottomID = Integer.parseInt(request.getParameter("bottom"));
        session.setAttribute("bottomID", bottomID);

        // Quantity (antal):
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        session.setAttribute("quantity", quantity);

        // Sum:

        double toppingPrice = request.getIntHeader("price");
        double bottomPrice = request.getIntHeader("price");

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
