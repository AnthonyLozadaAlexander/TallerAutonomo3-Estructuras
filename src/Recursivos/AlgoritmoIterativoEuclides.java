package Recursivos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgoritmoIterativoEuclides {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int mcdResul = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Algoritmo Para Calcular el MCD por Metodo Euclides");
		for (int i = 0; i < 1; i++) {
			try {
				System.out.println("Ingrese El Valor A");
				System.out.print("-> ");
				a = input.nextInt();
				input.nextLine();

				System.out.println("Ingrese El Valor B");
				System.out.print("-> ");
				b = input.nextInt();
				input.nextLine();
				
				if(a <= 0 || b <= 0) {
					System.out.println("Errror: Valores Ingresados No Pueden Ser Negativos O Cero");
					i--;
				}

			} catch (InputMismatchException e) {
				System.out.println("Error: Error de tipo de dato, se esperaba un numero entero");
				input.nextLine(); // limpiar buffer
				i--;
			} catch (NumberFormatException e) {
				System.out.println("Error: Formato Invalido De Numero Entero");
				input.nextLine(); // limpiar buffer
				i--;
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				input.nextLine(); // limpiar buffer
				i--;
			}
		}

		System.out.println("\nValor A: " + a);
		System.out.println("Valor B: " + b);
		System.out.print("\nEl MCD entre " + a + " y " + b + " es: ");
		while (b != 0) {
			int temp = b;
			b = (a % b); // residuo entre a y b
			a = temp; // resultado del mcd
		}

		mcdResul = a;
		System.out.print(mcdResul);

		input.close();

	}
}
