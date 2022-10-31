/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week01;

/**
 *
 * @author pensyarah
 */
public class W01E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double int01=0.01;
        double int02=0.0001;
        System.out.println(int01 + " \n" + int02);
        
        double num01, num02;
        num01 = 8;
        num02 = 3;
        
        System.out.println("num01/num02 = " + (num01/num02));
        
        int num03, num04;
        num03 = 8;
        num04 = 3;
        
        System.out.println("num03/num04 = " + (num03/(double)num04));
        System.out.printf("num03/num04 = %.2f\n",(num03/(double)num04) );
        
        float num05, num06;
        num05 = 8;
        num06 = 3;
        
        System.out.println("num05/num06 = " + (num05/num06));
        System.out.printf("num05/num06 = %.3f\n",(num05/num06) );
    }
    
}
