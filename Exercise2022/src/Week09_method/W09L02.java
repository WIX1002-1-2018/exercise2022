/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
public class W09L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1=10;
        char char1='A';
        
        multiPrint(number1, char1);
        multiPrint(5, 'B');
        multiPrint(number1, '%');
        
        System.out.println();
        trianglePrint(15,'&');
        diamond();
    }
    public static void multiPrint(int number1, char char1)
    {
        for (int i=0;i<number1;i++){
            System.out.print(char1);
        }
    }
    
    public static void trianglePrint(int num, char char1){
        for (int i = 1; i < num; i+=2) {
            multiPrint(i, char1);
            System.out.println();
        }
    }
    
    public static void diamond() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" ***** ");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
        
    }
}
