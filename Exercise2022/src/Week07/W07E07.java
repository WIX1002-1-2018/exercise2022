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
public class W07E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arraySize;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int searchKey=0,position=0;
        
        System.out.print("Enter the array size :");
        arraySize = input.nextInt();
        
        int[] number = new int[arraySize];
        
        for(int i=0;i<number.length;i++)
            number[i] = rand.nextInt(90)+10;
        
        System.out.print("Before Bubble Sort: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
        for(int pass = 1; pass < number.length; pass++ ) 
            for(int i = 0; i < number.length - 1; i++ ) 
                if(number[i] > number[i + 1] ){
                    int hold = number[i];        
                    number[i] = number[i+1];  
                    number[i+1] = hold;
		}
        
        System.out.print("\nAfter Bubble Sort: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
        
        System.out.print("\nEnter value for searching: ");
        searchKey = input.nextInt();
           
        int low = 0;
        int high = number.length-1;
        int mid;
        int count = 0;
        
        while(low<=high){
            mid = (low+high)/2;
            if(searchKey == number[mid]){
                 position = mid;
                 break;
            }
            else if(searchKey < number[mid])
                high = mid -1;
            else 
                low = mid +1;
            
            count++;
        }
        
        System.out.println("(Binary Search) The value found at position " + position + " after " + count + " loop");
        
        count=0;
        for(int i=0;i<number.length;i++){
           count++;
            if(number[i] == searchKey){
                position = i;
                break;
             } 
        }
            
            System.out.println("(Learch Search) The value found at position " + position + " after " + count + " loop");
        }
    
}
