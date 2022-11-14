/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number=0;
        /**
        while(number++ < 10)
            System.out.println("hello World");
           
        number = 0;
        while(number < 10){
            System.out.println(number + " Hello World");
            System.out.println("2nd Line of output");
            number++;
        }
        **/
        number=0;
        
        do
            System.out.println(number + " hello World (Do While)");
        while(number++ < 10);
        
        for(number=0;number<10;number++)
          System.out.println(number + " hello World (For Loop)");
        
        
    }
    
}
