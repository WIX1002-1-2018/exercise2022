/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week02_;

/**
 *
 * @author pensyarah
 */
public class W02E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float num, num1, num2;
        num1 = 22;
        num2 = 7;
        num = num1/num2;
        
        System.out.printf("The answer is %4.5f", num);
        
        float newNum = (float) 22 / (float) 7;
        
        System.out.printf("The answer is %4.5f", newNum);
    }
    
}
