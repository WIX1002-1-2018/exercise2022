/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W04E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int number=0, sum =0;
        
        while(number != -1){ // 10 != -1
            System.out.print("Enter a number (-1 to stop) :");
            number = input.nextInt();
            if(number !=-1)
                sum += number;   
        }
        
        System.out.println("The total number is " + sum);
        
    }
    
}
