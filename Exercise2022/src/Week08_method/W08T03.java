/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week08_method;

/**
 *
 * @author pensyarah
 */
public class W08T03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(combination(8,3));
        // TODO code application logic here
       
    }
    
    public static double combination (int n, int k){
        int nfact=1;
        for (int i=1;i<=n; i++)
            nfact*=i;
         int kfact=1;
        for (int i=1;i<=k; i++)
            kfact*=i;
         int nkfact=1;
        for (int i=1;i<=n-k; i++)
            nkfact*=i;
        
            return nfact/(kfact*nkfact);
    }
}
