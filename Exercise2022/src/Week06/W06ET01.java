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
public class W06ET01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0 ;
        String keyword = "the";
        System.out.println("Please enter the sentence : ");
        Scanner word = new Scanner (System.in);
        String ayat = word.nextLine();
        
        String[] ayatbaru = ayat.split(" ");
        for ( int i = 0 ; i<ayatbaru.length ; i++)
            if(ayatbaru[i].equals(keyword))
                sum++;
        
        System.out.println("The number of 'the' occurrence is : "+ sum );
        
         }
    
}
