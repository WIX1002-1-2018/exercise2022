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
public class W08T01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(maximum(25,8,100));
        
        int a = maximum(25,8,9);
        System.out.println(a);
    }
    
    public static int maximum(int num1, int num2, int num3){
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if (num3>max){
            max=num3;
        }
        return max;
}
}
