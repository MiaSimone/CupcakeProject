package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Topping;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;

public class Bestilling extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException, ClassNotFoundException {
        // Hent listen fra DB og set det på nogle scopes

        String toppingVariant = request.getParameter("topping");
        double price = request.getIntHeader("price");

        ArrayList<Topping> topping = LogicFacade.topping();

        Topping topping1 = new Topping(toppingVariant, price);
        HttpSession session = request.getSession();

        session.setAttribute("topping", topping);
        //session.setAttribute("toppingVariant", topping1.getTopping());
        //session.setAttribute("price", topping1.getToppingPrice());

        return "bestilling";

    }
}
