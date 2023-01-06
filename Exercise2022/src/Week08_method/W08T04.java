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
public class W08T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x=51;
        if(pentagon(x)){
            System.out.printf("%d is a pentagonal number",x);
        }
        else{
            System.out.printf("%d is not a pentagonal number",x);
        }
        
    }
    public static boolean pentagon(int x){
        int i=1,y;
        do{
            y=(i*(3*i-1))/2;
            i++;
        }
        while(y<x);
        if(y==x)
            return true;
        else
            return false;
            
    }
}
