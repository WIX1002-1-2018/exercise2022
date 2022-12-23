/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week08_method;

/**
 *
 * @author pensyarah
 */
public class W08T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        square(10);
    }
    public static void square(int x)
    {
        double fSquare;
        int iSquare;
        fSquare=Math.sqrt(x);
        iSquare=(int)fSquare;
        if(iSquare==fSquare)
            System.out.println(x + " is a square number");
        else
            System.out.println(x + " is not a square number");
    }
}
