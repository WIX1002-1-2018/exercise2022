/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Normal : ");
        int i;
        
        for(i=0;i<10;i++)
            System.out.print(i + " ");
        
        System.out.print("\nBreak : ");
        for(i=0;i<10;i++){
            if(i==6)
                break;
            System.out.print(i + " ");
        }
        
        System.out.print("\nContinue : ");
        for(i=0;i<10;i++){
            if(i==6)
                continue;
            System.out.print(i + " ");
        }
    }
    
}
