package optimizados;

public class Fibonacci {
	// Arreglo global para guardar los resultados
    static long[] tabla;

    public static void main(String[] args) {
        int n = 44;
        
        //Metodo Tradicional:
        long inicio1 = System.currentTimeMillis();
        long res1 = fiboNormal(n);
        long fin1 = System.currentTimeMillis();
        System.out.println("Metodo Tradicional:");
        System.out.println("Resultado: " + res1);
        System.out.println("Tiempo: " + (fin1 - inicio1) + " ms");

        System.out.println("_______");

        //Metodo optimizado:
        tabla = new long[n + 1];   
        long inicio2 = System.currentTimeMillis();
        long res2 = fiboOptimizado(n);
        long fin2 = System.currentTimeMillis();
        System.out.println("Metodo Optimizado:");
        System.out.println("Resultado: " + res2);
        System.out.println("Tiempo: " + (fin2 - inicio2) + " ms");
    }

    //Metodo Tradicional sin memorización 
    public static long fiboNormal(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fiboNormal(n - 1) + fiboNormal(n - 2);
    }

    //Metodo optimizado con memorización
    public static long fiboOptimizado(int n) {
        // Caso base
        if (n == 0 || n == 1) {
            return n;
        }

        // Si ya lo calculamos antes (si es diferente de 0), lo devolvemos
        if (tabla[n] != 0) {
            return tabla[n];
        }

        // Si no, lo calculamos y lo guardamos en la tabla
        tabla[n] = fiboOptimizado(n - 1) + fiboOptimizado(n - 2);
        return tabla[n];
    }
}
