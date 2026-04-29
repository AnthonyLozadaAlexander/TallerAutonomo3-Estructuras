package Recursivos;

import java.util.Scanner;

public class AlgoritmoNumeroPrimo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n; 
	
	System.out.println("Ingrese el numero a verificar: ");
	n = sc.nextInt();
	
	if (esPrimo(n)) 
		System.out.println("El numero " + n + " es primo.");
	else
		System.out.println("El numero " + n + " no es primo.");
	
	sc.close();
}

	
public static boolean esPrimo(int num) {
	if (num <= 1)	
		 return false;
	 if (num ==2)
		 return true;
	 else {
		 return verificar(num, 2);
		 
	 }
}


public static boolean verificar(int num, int divisor) {
	if (divisor * divisor > num) {
		return true;
	} else if (num % divisor == 0) {
		return false;
	} else {
		return verificar(num, divisor + 1);
	}

}
}