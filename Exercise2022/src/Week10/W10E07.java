/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class W10E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassOne one = new ClassOne();

        one.numTwo = 10;
        one.setNumOne(50);
        one.number();
        System.out.println(one.getNumOne());

        ClassOne two = new ClassOne(40);
        two.number();

        ClassOne three = new ClassOne(50, 80);
        three.number();

    }

}
