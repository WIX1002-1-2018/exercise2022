/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week06;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W06T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random number = new Random();
        int num = number.nextInt(256);
        System.out.println("The random number is :" +num);
        int remainder[] = new int [8] ;
       
        int i =7;
        do{
            remainder[i] = num%2;
            num = num/2;
            i--;
        }while(num >0);
        
        System.out.print("The binary is : ");
        for (i=0;i<remainder.length;i++)
            System.out.print(remainder[i]);
        }
        
    }
    

