package PresentationLayer;

import FunctionLayer.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Bestilling extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException, ClassNotFoundException {
        // Hent listen fra DB og set det på nogle scopes
        HttpSession session = request.getSession();

        // Topping:
        String topping = request.getParameter("topping");
        double price = request.getIntHeader("price");

        List<Topping> toppingList = LogicFacade.getAllToppings();

        Topping topping1 = new Topping(topping, price);

        session.setAttribute("toppingList", toppingList);
        session.setAttribute("topping", topping1.getTopping());
        session.setAttribute("price", topping1.getToppingPrice());

        // Bottom:
        String bottom = request.getParameter("bottom");
        double priceBottom = request.getIntHeader("price");

        List<Bottom> bottomList = LogicFacade.getAllBottoms();

        Bottom bottom1 = new Bottom(bottom, priceBottom);

        session.setAttribute("bottomList", bottomList);
        session.setAttribute("bottom", bottom1.getBottom());
        session.setAttribute("bottomprice", bottom1.getBottomPrice());


        return "bestilling";

    }
}
