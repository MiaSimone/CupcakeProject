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

        HttpSession session = request.getSession();

<<<<<<< HEAD
        List<Topping> toppingList = LogicFacade.getAllToppings();

        Topping topping1 = new Topping(topping, price);

=======
        // Ting der skal settes på bestilling:
        ArrayList<Topping> toppingList = LogicFacade.topping();
>>>>>>> d508095dbe4d3f572e2fae1131c1fdbc7d399714
        session.setAttribute("toppingList", toppingList);

<<<<<<< HEAD
        List<Bottom> bottomList = LogicFacade.getAllBottoms();
=======
        ArrayList<Bottom> bottomList = LogicFacade.bottoms();
        session.setAttribute("bottomList", bottomList);
>>>>>>> d508095dbe4d3f572e2fae1131c1fdbc7d399714

        // Ting der skal hentes fra bestilling:
        String toppingName = request.getParameter("toppingName");
        String bottomName = request.getParameter("bottomName");

        Cupcake cupcake = new Cupcake(toppingName, bottomName);
        cupcake.setCupcakePrice(cupcake.totalPriceCalculator(toppingName, bottomName));

        


        return "bestilling";

    }
}
