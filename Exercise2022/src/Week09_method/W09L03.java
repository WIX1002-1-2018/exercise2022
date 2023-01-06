/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
import java.util.Scanner;
public class W09L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] rev = new int[10];
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 10 integers for the array: ");
        System.out.println("Normal: ");
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+", ");
        }
        System.out.println("\b\b");
        
        System.out.println("Reverse of the integers: ");
        for(int i=0;i<10;i++){
            rev[i] = Reverse(arr[i]);
            System.out.print(rev[i]+", ");
        }
        System.out.println("\b\b");
    }
    
    public static int Reverse(int a){
        int reverse =0, remainder;
        while(a>0){
            remainder = a%10;
            reverse = reverse*10 + remainder;
            a = a/10;
        }
        return reverse;
    }
    
    
    
}
