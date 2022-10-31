/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

/**
 *
 * @author pensyarah
 */
public class W03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String myName =  "Nor Badrul Anuar";
        String yourName = "Firdaus";
        
        System.out.println(myName.charAt(3));
        System.out.println(yourName.charAt(5));
        
        int number = 207536;
        
        System.out.println(number%100/10);
        System.out.println(number%10000/1000);
        
        String numberToString = Integer.toString(number);
        System.out.println(numberToString.charAt(2));
        
        
    }
    
}
