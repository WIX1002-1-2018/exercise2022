/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week05;

/**
 *
 * @author pensyarah
 */
public class W05T01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n=1;
        
        do{
        n++;    
        }while(n*n*n<2000);
        
        System.out.println("The Largest Number is " + ((n-1)));
            
        
            
    }
    
}
