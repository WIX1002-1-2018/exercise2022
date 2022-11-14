/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**    for(int j=0;j<10;j++){
                for(int i=0;i<10;i++){
                    if(i==5)
                        break;
                    System.out.println("Value j :" + j + " Value i " + i);
                }
                System.out.println("Value j:  " + j);
            }
        **/        
        System.out.println("With Label 1");
        
        label1:{
            for(int j=0;j<10;j++){
                for(int i=0;i<10;i++){
                    if(i==5)
                        break label1;
                    System.out.println("Value j :" + j + " Value i " + i);
                }
                System.out.println("Value j:  " + j);
            }
                
        }
        
        int i;
        System.out.println("Without Label 1");
        for(int j=0;j<10;j++){
                for(i=0;i<10;i++){
                    if(i==5)
                        break;
                    System.out.println("Value j :" + j + " Value i " + i);
                }
                if(i==5)
                    break;
                System.out.println("Value j:  " + j);
          
         }
    }
    
}
