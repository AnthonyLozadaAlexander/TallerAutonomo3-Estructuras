package Recursivos;

public class AlgoritmoFibonacci {
	 public static void main(String[] args) {
		 int n = 44;
		 
		 System.out.println("______Metodo Iterativo______");
		 long inicioIterativo = System.currentTimeMillis();
		 fibonnaciIterativo(n);
		 long cierreIterativo = System.currentTimeMillis();
		 System.out.println("\nTiempo De Ejecucion: " + (cierreIterativo - inicioIterativo) + " ms\n");
		 
		 System.out.println("______Metodo Recursivo_____");
		 long inicioRecursivo = System.currentTimeMillis();
		 System.out.print("\n{ ");
		 for (int i = 1; i <= n; i++) {
			System.out.print(fibonacciRecursivo(i) + ", ");
			if(i == n) {
				System.out.print(fibonacciRecursivo(i));
			}
		}
		 System.out.print(" }\n");
		 long cierreRecursivo = System.currentTimeMillis();
		 System.out.println("Tiempo De Ejecucion: " + (cierreRecursivo - inicioRecursivo) + " ms");
		 
		
	}
	public static void fibonnaciIterativo(int n) {
		if(n < 0) {
			System.out.println("Error: N debe ser un numero positivo");
		}else {
			long a = 1;
			long b = 1;
			
			System.out.print("{ ");
			
			for (int i = 0; i <= n; i++) {
				System.out.print(a + ", ");
				long siguiente = a + b;
				a = b;
				b = siguiente;
				if(i == n) { // no lleva coma al final del ultimo numero
					System.out.print(a);
				}
			}
			
			System.out.print(" }");
		}
		
	}
	
	public static long fibonacciRecursivo(int n) {
			long resultado;
			
			if(n == 1 || n == 2) {
				resultado = 1;
			}else {
				resultado = fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
			}
			
			return resultado;
	}
}
