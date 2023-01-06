/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week08_method;
import java.util.*;
/**
 *
 * @author pensyarah
 */
public class W08T0H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(randomnum());
    }
    static int randomnum()
    {
        Random rd = new Random();
        int test;
        boolean[] repeat = new boolean[11];
        while(true)
        {
            test = rd.nextInt(11);
            if(repeat[test]==true)
                return test;
            else
                repeat[test]=true;
        }
    }    
        
}
