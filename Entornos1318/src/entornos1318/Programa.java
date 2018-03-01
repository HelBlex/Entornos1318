/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos1318;

import java.util.Scanner;

/**
 *
 * @author radpas
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean jugar = true; 
    
       System.out.println("VAMOS A JUGAR");
       Scanner scan =new Scanner(System.in);
      
      
       while(jugar){
       
    	   
    	   int adivinar= 1+ (int)(10.0 * Math.random());
    	   System.out.println(adivinar);
       System.out.print("Dime un numero del 1 al 10: ");
       int num =(int) scan.nextFloat();
       if(num == adivinar) {
           System.out.println("¡Acertaste! :D");
           
       }
           
       
       else {
               System.out.println("¡No! Era el " +adivinar);
       }
       if(num<=0) {
           System.out.println("Adios...");
           System.exit(0);
        
    }
       }
}
}