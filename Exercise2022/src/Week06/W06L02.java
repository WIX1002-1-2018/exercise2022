/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week06;

/**
 *
 * @author pensyarah
 */
import java.util.Random;
public class W06L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand =new Random();
        
        int[]num=new int[10];
        
        int i=0;
        int flag=0;
        
        while(i<10){
            flag=0;
            num[i]=rand.nextInt(10);
            for(int j=0;j<i;j++){
                if (num[i] == num[j])
                    flag=1;
                }
            
            if(flag==0){
                System.out.print(num[i] + " ");
                i++;
            }
           
        }
      
    }
}
    
