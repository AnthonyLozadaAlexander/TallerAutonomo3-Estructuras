package recursivoGenerico;

public class imprimirVectorRecursivo {
	public static void main(String[] args) {
		Integer[] vector = {1, 2, 3, 4, 5};
		imprimirVector(vector);
		
	}
	
	public static <T> void imprimirVector(T[] vector) {
		vectorRecursivo(vector, 0);
	}
	
	public static <T> void vectorRecursivo(T[] vector, int index){
		if(index == 0) {
		System.out.print("{");
		}
		
		if(index == vector.length) {
			return;
		}
		
		System.out.print(vector[index] + ", ");
		vectorRecursivo(vector, index + 1);
		
		if(index == vector.length - 1) {
			System.out.print(vector[index] + "}");
		}
	}
}
