/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week05;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class W05T01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int i,j,flag =0,n=100;
          Random rand = new Random();
          n = rand.nextInt(101);
         
         System.out.println("prime numbers between 0 - "+n+": ");
    for(j=1; j<=n ; j++)
        {
        for (i = 2; i <= j/2; ++i) {

            if (j % i == 0) {
            flag = 1;
            break;
            }
        }
    if(j==1){
    
        System.out.println("");
    
    }
else{
    if (flag == 0)
        System.out.println(j);
    //else
      //  System.out.println("-");
    }
    flag = 0;
     
        }
    
     }
}
    

