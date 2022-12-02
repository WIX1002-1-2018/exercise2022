/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W06L01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        
        int totalstd, scores;
        do{
            System.out.print("Enter the total number of students : ");
            totalstd = keyboard.nextInt();
        } while (totalstd < 0);
        
        int[] student = new int[totalstd];
        int[] score = new int[totalstd];
        
        for (int i = 0; i < totalstd; i++){
            scores = random.nextInt(101);
            
            student[i] += i +1;
            score[i] += scores;
        }
        
        int scorehold = score[0];
        int low = score[0];
        int high = score[0];
        int totalscore = 0;
        double average;
        for (int i = 0; i < totalstd; i++){
          
            
            /*** if (score[i] < scorehold && score[i] < low){
                low = score[i];
            }
            if (score[i] > scorehold && score[i] > low){
                high = score[i];
            }
            else if (scorehold > score[i] && scorehold > high){
                high = scorehold;
            }**/
           
            if(score[i]>high)
                high=score[i];
            if(score[i]<low)   
                low=score[i];
            
            scorehold = score[i];
            totalscore += score[i];
        }
        
        average = (double) totalscore / totalstd;
        
        System.out.println("\nStudent\t\tScore");
        for(int i = 0; i < totalstd; i++){
            System.out.printf("\n  %d\t\t  %d", student[i], score[i]);
        }
        System.out.printf("\n\nThe highest score is : %d", high);
        System.out.printf("\nThe lowest score is : %d", low);
        System.out.printf("\nThe highest score is : %.2f\n", average);
    }
    
}
