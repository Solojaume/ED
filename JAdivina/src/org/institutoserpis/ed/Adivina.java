package org.institutoserpis.ed;
import java.util.*;

public class Adivina {
	public static void main(String[]arg){
	       int num,cont=0, numAleatorio;
	       int minimo = 1;
	       int maximo = 1000;
	       
	      // double doubleAleatorio=Math.random()*1000;
	      // numAleatorio= ((int)doubleAleatorio) + 1;
	       Scanner tcl=new Scanner(System.in);
	       Random random = new Random();
	       numAleatorio = random.nextInt(1000)+1;
	       
	       System.out.println("Adivina el numero en el que pienso");
	       
	       do{
	            /*Primero le pedimos un numero al usuario del 1 al 1000 obligandolo a 
	            introducir un valor correcto*/ 
	           do{
	               System.out.printf("Introduce un numero (entre %s y %s) [intento %s] \n",minimo,maximo,cont);
	               num=Integer.parseInt(tcl.nextLine());
	              }while(num<1||num>1000);
	           
	           /*Con esto indicamos al usuario si el numero introcido es mayor o menor*/
	           if(num>numAleatorio){
	               System.out.println("Es mayor");
	               maximo = num;
	            }
	           if(num<numAleatorio){
	               System.out.println("Es menor");
	               minimo = num;
	            }   
	           cont++;
	         }while(num!= numAleatorio);
	       System.out.println("Acertaste, te ha costado "+cont+" intentos");
	
	}
}
