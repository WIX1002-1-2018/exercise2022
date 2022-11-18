/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *5
 * @author Badrul
 */
public class W04T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year=2096;
        
        if(year%400 ==0)
             System.out.println("it is a leap Year");
        else{
            if(year%4==0 && year%100!=0)
                System.out.println("it is a leap Year");
            else
                System.out.println("Not");
        }
       
       
    }
    
}
