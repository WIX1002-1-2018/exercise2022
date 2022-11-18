/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W04E04_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter how many number");
        number = input.nextInt();
        int count=0;
        int num00;
        int largest=0;
        int smallest=0;
        
        do{
            System.out.print("Number " + ++count + ": ");
            num00 = input.nextInt();
            
            if(count == 1){
                smallest = num00;
                largest = num00;
            }
            
            if(num00>largest)
                largest=num00;
            
            if(num00<smallest)
                smallest=num00;
            
        }while(count < number);
        
        System.out.println("The largest number : " + largest);
        System.out.println("The smallest number : " + smallest);
    }   
}
