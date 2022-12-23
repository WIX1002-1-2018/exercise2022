/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
public class W09L04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=210,b=45;
   
        
        
        System.out.println("gcd = " + gcd(a,b));
    }
    
    public static int gcd(int a, int b){
        while(b!=0){
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        
        return a;
    }
}
