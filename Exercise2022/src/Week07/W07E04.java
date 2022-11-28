/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week07;

import java.util.Random;

/**
 *
 * @author Badrul
 */
public class W07E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        
        int [][] scoreTable =  new int[4][3]; 
        
         for(int i=0;i<scoreTable.length;i++){
             for(int j=0;j<scoreTable[0].length;j++)
                System.out.print(scoreTable[i][j] + " ");
            System.out.println("");
        }
        
        scoreTable[0][0] = 10;
        scoreTable[2][2] = 100;
        
        for(int i=0;i<scoreTable.length;i++)
            for(int j=0;j<scoreTable[0].length;j++)
                System.out.println("position ["+ i +"]["+j+"] = " + scoreTable[i][j]);
                
        for(int i=0;i<scoreTable.length;i++){
             for(int j=0;j<scoreTable[0].length;j++)
                System.out.print(scoreTable[i][j] + " ");
            System.out.println("");
        }
        
        for(int i=0;i<scoreTable.length;i++)
             for(int j=0;j<scoreTable[0].length;j++)
                 scoreTable[i][j] = rand.nextInt(90)+10;
            
        for(int i=0;i<scoreTable.length;i++){
             for(int j=0;j<scoreTable[0].length;j++)
                System.out.print(scoreTable[i][j] + " ");
            System.out.println("");
        }
        
        
        
           
        
        
    }
    
}
