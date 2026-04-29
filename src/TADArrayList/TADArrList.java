package TADArrayList;

import java.util.ArrayList;

public class TADArrList <T>{
	
	private ArrayList<T> TAD;
	private String nombre;
	
	public TADArrList(String nombre){
		super();
		this.nombre = nombre;
		this.TAD = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "TADArrList:" + TAD +   
				"Nombre: " + nombre;
				 
	}
	
	public void imprimirVector() {
		for (int i = 0; i < TAD.size(); i++) {
			if (i == 0)
				System.out.print("[");
			if (i <= TAD.size() - 2) {
				System.out.print(TAD.get(i) + ", ");
			} else {
				System.out.print(TAD.get(i));
			}

			if (i == TAD.size() - 1)
				System.out.print("]\n");
		}

	}
	
	public void imprimirVectorCompleto() {
		System.out.print("[");
		for (int i = 0; i < TAD.size(); i++) {
			if(TAD.get(i) != null) {
			if (i == 0)
				
			if (i <= TAD.size() - 2) {
				System.out.print(TAD.toString() + " Elemento: " + TAD.get(i) + ", ");
			} else {
				System.out.print(TAD.toString() + " Elemento: " + TAD.get(i));
			}

		}
		}
		System.out.print("]\n");
		
	}
	
	public Boolean insertarElemento(T dato) {
		return TAD.add(dato);
		
	}
	
	public Boolean insertElement(T dato, int index) {
		boolean resul = false;
		if(index >= 0 && index < TAD.size() && TAD.get(index) == null) {
			TAD.add(index, dato);
			resul = true;
		}
		
		return resul;
	}
	
	public Boolean modificarElemento(T dato) {
		boolean resul = false;
		for(int i = 0; i < TAD.size(); i++){
			if(TAD.get(i) != null && TAD.get(i).equals(dato)) {
				TAD.set(i, dato);
				resul = true;
				i = TAD.size();
			}
		}
		
		return resul;
	}
	
	public Boolean modificarElemento(T dato, int index) {
		boolean resul = false;
		if(index >= 0 && index < TAD.size() && TAD.get(index) != null){
			TAD.set(index, dato);
			resul = true;
		}
		return resul;
	}
	
	public T leerElemento(int index) {
		// con Index no requeremos iterar el arrayList
		T resul = null;
		if(index >= 0 && index < TAD.size() && TAD.get(index) != null){
			resul = TAD.get(index);
		}
		
		return resul;
	}
	
	public int buscarElemento(T dato) {
		// Requerimos iterar el arrayList
		int index = 0;
		for (int i = 0; i < TAD.size(); i++) {
			if(TAD.get(i)  != null && TAD.get(i).equals(dato)) {
				index = i;
				i = TAD.size();
				return index;
			}
		}

		return -1;
	}
	
	public Boolean eliminarElemento(int index) {
		boolean resul = false;
		// que no haya desborde de indice y que el elemento a eliminar no sea null
		if(index >= 0 && index < TAD.size() && TAD.get(index) != null) {
			TAD.remove(index);
			resul = true;
		}
		
		return resul;
	}
	
	public Boolean eliminarElemento(T dato) {
		boolean resul = false;
		if(dato == null) {
			return resul;
		}
		
		for(int i = 0; i < TAD.size(); i++) {
		  	if(TAD.get(i) != null && TAD.get(i).equals(dato)) {
		  		TAD.remove(i);
		  		resul = true;
		  		i = TAD.size();
		  	}
		}
		
		return resul;
	}
}
