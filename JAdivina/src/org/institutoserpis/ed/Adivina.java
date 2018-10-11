package org.institutoserpis.ed;
import java.util.*;
public class Adivina {
	public static void main(String[]arg){
	       int num,cont=0, numAleatorio;
	       double doubleAleatorio=Math.random()*1000;
	       numAleatorio= ((int)doubleAleatorio) + 1;
	       Scanner tcl=new Scanner(System.in);
	       System.out.println("Adivina el numero en el que pienso");
	       
	       do{
	            /*Primero le pedimos un numero al usuario del 1 al 1000 obligandolo a 
	            introducir un valor correcto*/ 
	           do{
	               System.out.println("Introduce un numero del 1 al 1000");
	               num=tcl.nextInt();
	             }while(num<1||num>1000);
	           
	           /*Con esto indicamos al usuario si el numero introcido es mayor o menor*/
	           if(num>numAleatorio){
	               System.out.println("Es mayor");
	            }
	           if(num<numAleatorio){
	               System.out.println("Es menor");
	            }   
	           cont++;
	         }while(num!= numAleatorio);
	       System.out.println("Acertaste, te ha costado "+cont+" intentos");
	
	}
}
