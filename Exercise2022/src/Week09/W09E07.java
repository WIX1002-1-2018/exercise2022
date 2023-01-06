/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W09E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Random rand = new Random();
        try {
            PrintWriter write = new PrintWriter(new FileOutputStream("c:/temp/integer.txt"));

            for (int i = 0; i < 100; i++) {
                int num = rand.nextInt(100);
                System.out.print(num + " ");
                write.print(num + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

}
