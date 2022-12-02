/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week06;
import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class W06T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Please enter a sentence: ");
        word = input.nextLine();
        
        System.out.print("Reverse word: ");
        for (int i=word.length()-1; i>=0; i--)
            System.out.print(word.charAt(i));
        
        System.out.println();
        
        System.out.print("Please enter a sentence: ");
        word = input.nextLine();
        
        String[] words = word.split(" ");
        
        for(int j=0; j<words.length; j++){
            System.out.print("Reverse word [" + words[j] + "]: ");
            for (int i=words[j].length()-1; i>=0; i--)
                System.out.print(words[j].charAt(i));        
            System.out.println();
        }
            
        
        
        
        
    }
    
}
