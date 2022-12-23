/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09_method;

/**
 *
 * @author pensyarah
 */
public class W09E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /**  HelloWorld();
        GoodMorning();
        GoodMorning();
        HelloWorld();
        HelloWorld();
        HelloWorld();**/
      
        StringWithParameter("Hello world and Good Morning");
        System.out.println(AddingTwoInt(5,6));
        System.out.println(AddingTwoInt(5,6)+AddingTwoInt(50,60));
        
        int n1=5,n2=2;
        
        System.out.println(ChangingValue(n1,n2));
        
        System.out.println(n1);
        System.out.println(n2);
        
        
            
    }
    
     public static int ChangingValue(int num1,int num2){
        num1++;
        num2++;
        return num1+num2;
    }
    
    public static int AddingTwoInt(int num1,int num2){
        return num1+num2;
    }
    public static void StringWithParameter(String words){
        System.out.println(words);
    }
    
    public static void HelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");  
        System.out.println("Hello World");
    }
    
    public static void GoodMorning(){
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
    }
    
    
}
