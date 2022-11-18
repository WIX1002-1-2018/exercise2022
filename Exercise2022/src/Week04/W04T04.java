/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W04T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner x = new Scanner(System.in);
        int p,q,r;
        
        System.out.print("Enter p: ");
        p=x.nextInt();
        System.out.print("Enter q: ");
        q=x.nextInt();
        System.out.print("Enter r: ");
        r=x.nextInt();
        
        if (p>q&&p>r)
            System.out.println(p+" is the biggest number");
        else if (q>p&&q>r)
            System.out.println(q+" is the biggest number");
        else if (r>p&&r>q)
            System.out.println(r+" is the biggest number");
        else 
            System.out.println("Number cannot be same!!!");
    }
    
}
