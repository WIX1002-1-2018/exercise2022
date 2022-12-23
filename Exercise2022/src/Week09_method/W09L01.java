/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
public class W09L01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        
        System.out.println(sum(20));
    }
    
    public static int sum(int num){
        int sum1=0;
        
        for(int i = 0;i<=num;i++){
            sum1+=i;
            
        }
        return sum1;
    }
    
    
}
