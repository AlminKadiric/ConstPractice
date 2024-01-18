package exerciseOne;

import java.io.IOException;
import java.sql.SQLException;

public class Exercise {

    public static void main(String[] args) {


        try{
            int a = 10;
            System.out.println(a/0);

        }catch ( Exception ex){
            System.err.println(ex.getMessage());
            System.err.println(ex.getCause());
//            System.out.println(ex.getCause());
//            System.err.println(ex.getLocalizedMessage());



        }
        finally {
            System.out.println("This will be anyway!!!");
        }
    }
}
