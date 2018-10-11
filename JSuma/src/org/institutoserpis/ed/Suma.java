package org.institutoserpis.ed;
import java.util.*;
import java.math.BigDecimal;

public class Suma {
	public static void main(String[] args) {
		Scanner tcl = new Scanner (System.in);
		System.out.print("Introduce un número: ");
	    BigDecimal numero1= new BigDecimal(tcl.nextLine());
	    System.out.print("Introduce un número: ");
	    BigDecimal numero2= new BigDecimal(tcl.nextLine());
		System.out.println("Primer número = "+numero1);
		System.out.println("Primer número = "+numero2);
		
		BigDecimal suma =numero1.add(numero2);
		BigDecimal resta =numero1.subtract(numero2);
		BigDecimal producto =numero1.multiply(numero2);
		BigDecimal dividir =numero1.divide(numero2);
	    System.out.println("Suma ="+suma);
	    System.out.println("resta ="+resta);
	    System.out.println("Producto ="+producto);
	    System.out.println("Dividir ="+dividir);
	}
}
