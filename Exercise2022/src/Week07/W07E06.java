/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W07E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arraySize;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int searchKey,position=0;
        
        System.out.print("Enter the array size :");
        arraySize = input.nextInt();
        
        int[] number = new int[arraySize];
        
        for(int i=0;i<number.length;i++)
            number[i] = rand.nextInt(90)+10;
        
        System.out.print("Before Bubble Sort: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
        System.out.print("\bEnter value for searching: ");
        searchKey = input.nextInt();
        
        for(int i=0;i<number.length;i++)
             if(number[i] == searchKey){
                position = i;
                break;
             }
          System.out.println("The value at position : " + position);
    }
    
}
