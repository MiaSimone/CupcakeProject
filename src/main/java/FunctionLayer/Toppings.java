package FunctionLayer;

import DBAccess.CupcakeMapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Toppings {

    private static List<Topping> toppingList;

    public static void initToppings() throws SQLException, ClassNotFoundException {

        if (toppingList == null){
            toppingList = new ArrayList<>();
         // Hent toppings fra databasen
            CupcakeMapper cupcakeMapper = new CupcakeMapper();
            toppingList = cupcakeMapper.toppingList();
            System.out.println("Størrelsen: " + toppingList.size());


             toppingList.add(new Topping(1, "Test1", 4.00));
             toppingList.add(new Topping(2, "Test2", 8.00));
        }


    }

    public static List<Topping> getToppingList() {
        return toppingList;
    }
}
