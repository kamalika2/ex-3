/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonic.numbers;

/**
 *
 * @author kamalika
 */
public class HarmonicNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
         int i=Integer.parseInt(args[0]);//command line argument can be done only in main class
        abc.series(i);
        
    }
    
}
    class abc
    {
        
        static double r=0;
        
         static void series(int i)
        {
           
            while(i>0)
            {
                r=(r+((double)1/i));
                i--;
            }  
            System.out.println("the harmonic series is"+r);
        }        
    }        
 