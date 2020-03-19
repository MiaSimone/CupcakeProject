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
        int toppingValue = 0;
        toppingValue = Integer.parseInt(request.getParameter("topping"));
        session.setAttribute("toppingValue", toppingValue);

        // BottomID:
        int bottomValue = 0;
        bottomValue = Integer.parseInt(request.getParameter("bottom"));
        session.setAttribute("bottomValue", bottomValue);

        // Quantity (antal):
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        session.setAttribute("quantity", quantity);

        // Sum:
        
        double toppingPrice = Topping
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
