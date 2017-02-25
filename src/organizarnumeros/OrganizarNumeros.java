/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizarnumeros;

import java.util.Scanner;



/**
 *
 * @author Alejandra
 */
public class OrganizarNumeros {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner usuario = new Scanner (System.in);
        
        int vector [] = new int[10];
        int aux [] = new int[10];
        int i,j,orden,cont = 0;
        
        for(i = 0 ; i < 10 ; i++){
            cont=cont+1;
            System.out.println("Digite el #"+cont);
            vector[i] = usuario.nextInt();  
        }
          for(i = 0 ; i < 10 ; i++){
           aux[i] =vector[i]; 
        }
          
         for (i=0;i<10;i++){
	    for(j=i+1;j<10;j++)	{
	       if (aux[i]>aux[j]){
	       	
	       	orden=aux[j];
	       	aux[j]=aux[i];
	       	aux[i]=orden;
	       	
		   }
	    }
         }
        
        System.out.print("El orden es:");
       for (i=0;i<11;i++){
		   if (aux[i]!=aux[i+1]){
		   	
		   		System.out.println(aux[i]+",");
		   	
		   }		
		
	}	
    
}
}
