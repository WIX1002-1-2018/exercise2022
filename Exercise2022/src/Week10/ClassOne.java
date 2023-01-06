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
public class ClassOne {

    private int numOne;
    public int numTwo;

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public ClassOne() {
        System.out.println("First Constructor");
    }

    public ClassOne(int numOne) {
        System.out.println("Constructor One");
        this.numOne = numOne;
    }

    public ClassOne(int numOne, int numTwo) {
        System.out.println("Constructor Two");
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public void number() {
        System.out.println("Result of the sum : " + (numOne + numTwo));
        printPrivate();
    }

    private void printPrivate() {
        System.out.println("This is private Print Class");
    }

}
