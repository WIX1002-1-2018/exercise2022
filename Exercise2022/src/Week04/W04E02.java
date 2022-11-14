/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        for(number=1;number<10;number++)
            if(number%2==0)
                System.out.println(number + " hello World (For Loop)");
        
        int num = 1;
        while (num<10){
            if (num%2==0)
                System.out.println(num + " aiman = Hello World (while)");
            num++;
        }

        for(number=0;number<100;number+=10)
                System.out.println(number + " hello World (For Loop)");
        
        number = -10;
        while((number+=10) <100) {
            System.out.println(number + " Ahmed hello world (while oop)");
            
        }
        
        number = 0;
        while(number <100) {
            System.out.println(number + " Zhili Fang hello world (while oop)");
            number += 10;
        }
       
        number = -10;
        while(number <100) {
            number +=10;
            System.out.println(number  + " Ahmed2 hello world (while oop)");
            
        }
     

       
        
    }
    
}
