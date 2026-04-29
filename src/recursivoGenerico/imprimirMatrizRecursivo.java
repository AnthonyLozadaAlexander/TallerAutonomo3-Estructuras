package recursivoGenerico;

public class imprimirMatrizRecursivo {
	public static void main(String[] args) {
        
        Integer[][] matrizRegular = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        String[][] matrizIrregular = {
            {"A", "B"},
            {"C", "D", "E", "F"},
            {"G"}
        };

        System.out.println("--- Matriz Regular ---");
        imprimirMatriz(matrizRegular);

        System.out.println("\n--- Matriz Irregular ---");
        imprimirMatriz(matrizIrregular);
    }
	
	public static <T> void imprimirMatriz(T[][] matriz) {
        // Iniciamos en la fila 0, columna 0
        imprimirMatrizAuxiliar(matriz, 0, 0);
    }
	
	private static <T> void imprimirMatrizAuxiliar(T[][] matriz, int fila, int columna) {
        
		if(fila == 0 && columna == 0) {
			System.out.print("{ ");
		}
		
		if(fila == matriz.length - 1 && columna == matriz[fila].length) {
			System.out.print(" }");
		}
		
        if (fila == matriz.length) {
            return;
        }

        
        if (columna == matriz[fila].length) {
            System.out.println(); 
            imprimirMatrizAuxiliar(matriz, fila + 1, 0);
            return; 
        }
 
        System.out.print(" " + matriz[fila][columna] + "\t");
        imprimirMatrizAuxiliar(matriz, fila, columna + 1);
        
       
    }
}
