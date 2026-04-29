package Recursivos;

import java.util.Scanner;

public class AlgoritmoNPrimos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
        System.out.print("Ingrese la cantidad de n numeros primos a generar: ");
        n = input.nextInt();
        input.nextLine(); // limpiar
		if(n <= 0) {
			System.out.println("Debe Ingresar un numero positivo");
		}else {
		System.out.println("Los primeros " + n + " numeros primos son: ");
		nPrimosAux(n, 0, 2); // comenzamos desde el 2 hasta n para verificar los numeros primos
		System.out.println();
		}
		
		input.close();
	}
	
	
	private static void nPrimosAux(int n, int encontrados, int numActual) {
		if (encontrados < n) {
			if (esPrimo(numActual, numActual / 2)) {
				System.out.print(numActual + " ");
				nPrimosAux(n, encontrados + 1, numActual + 1);
			} else {
				nPrimosAux(n, encontrados, numActual + 1);
			}
		}
	}
	
	private static boolean esPrimo(int num, int divisor) {
		boolean esUnPrimo = false;
		
		if(num <= 1) {
			esUnPrimo = false;
		}
		else if(divisor == 1) {
			esUnPrimo = true;
		}else if(num % divisor == 0) {
			esUnPrimo = false;
		}else {
			esUnPrimo = esPrimo(num, divisor - 1);
		}
		
		return esUnPrimo;
	}
}
