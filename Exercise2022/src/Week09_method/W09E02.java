/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
public class W09E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] num ={10,20};
        
        for(int i=0;i<num.length;i++)
            System.out.println(num[i]);
        
        ChangingValue(num);
        
         for(int i=0;i<num.length;i++)
            System.out.println(num[i]);
        
    }
    
    public static void ChangingValue(int [] num){
        for(int i=0;i<num.length;i++)
            num[i]++;
        
    }
        
    
}
