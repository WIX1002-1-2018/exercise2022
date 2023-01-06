/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week08_method;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W08T06 {

    /**
     * @param args the command line arguments
     */
    
    public static int change(int a){
        a = a+100;
        return a;
        
    }
    public static void Random(int[] array)
    {
        Random obj=new Random();
        for(int i=0;i<10;i++)
        {
            array[i]=obj.nextInt(99)+1;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100;
        int b = change(a);
        System.out.println(a);
        System.out.println(b);
       int array[]=new int[10];
       Random(array);
       for(int i=0;i<10;i++)
            System.out.println("Random no."+(i+1)+" "+array[i]);
        
    }
    
}
