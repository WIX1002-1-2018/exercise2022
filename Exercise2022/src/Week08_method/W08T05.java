/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week08_method;

/**
 *
 * @author pensyarah
 */
import java.util.Scanner;
public class W08T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ayat = sc.nextLine();
        sentence(ayat);
    }
    public static void sentence(String ayat){
        int letter = 0;
        int digit = 0;
        
        for (int i=0;i<ayat.length();i++){
            char c = ayat.charAt(i);
            if(Character.isLetter(c)){
                letter++;
            }
            else if(Character.isDigit(c)){
                digit++;
            }
        }
        System.out.println("Number of letters"+letter);
        System.out.println("Number of digit"+digit);
    }
    
}
