package FunctionLayer;

import DBAccess.CupcakeMapper;
import DBAccess.UserMapper;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String name, String email, String password ) throws LoginSampleException {
        User user = new User(name, email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

    public static ArrayList<Topping> topping( ) throws LoginSampleException, SQLException, ClassNotFoundException {
        CupcakeMapper c = new CupcakeMapper();
        return c.toppingList();
    }

    public static ArrayList<Bottom> bottoms( ) throws LoginSampleException, SQLException, ClassNotFoundException {
        CupcakeMapper c = new CupcakeMapper();
        return c.bottomList();
    }


}
