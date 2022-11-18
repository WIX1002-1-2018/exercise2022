/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author Badrul
 */
public class W04T02_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        String s1="hello", s2="hello";
        if (s1.equals(s2))
         System.out.println("They are equal strings.");
        else 
         System.out.println("They are not equal strings.");
        
        int x=-9,y=-20;
        if(x>0 || y>0)
            System.out.println("Either x or y is positive");
        
        x=9;
        y=10;
        if (x < 10) 
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        
        System.out.println("$$$$$");
        
        System.out.println("3b");
        
        if (x < 10) {
            if (y < 10)
                System.out.println("*****");
            else{
                System.out.println("#####");
                System.out.println("$$$$$"); 
            }
        }
        
        System.out.println("3c");
        
     
        if (x < 10) {
            if (y < 10)
                System.out.println("*****");
            System.out.println("#####");
        }
        else{
            System.out.println("$$$$$"); 
        }
        
        x=11;
        System.out.println("3d");
        if (x > 10) {
            if (y > 10){
                System.out.println("*****");
                System.out.println("#####"); 
            }
            else 
                System.out.println("$$$$$");
        }

        

    }
    
}
