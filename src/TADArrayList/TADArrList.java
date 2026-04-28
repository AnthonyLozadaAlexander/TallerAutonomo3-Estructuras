package TADArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TADArrList <T>{
	
	private ArrayList<T> TAD;
	private String nombre;
	
	public TADArrList(String nombre){
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "TADArrList:" + TAD + "\n" + 
				"Nombre: " + nombre + "\n";
				 
	}
	
	// longitud = 5
	// [1,  2,  3,  4,  5]
	// [0] [1] [2] [3] [5]
	// [
	public void imprimirArrayList() {
	  for (int i = 0; i < TAD.size(); i++) {
		  if(i == 0) System.out.print("[");
		 if(i <= TAD.size() - 2) {
			 System.out.print(TAD.get(i) + ", ");
		 }else {
			 System.out.print(TAD.get(i));
		 }
		 
		 if(i == TAD.size() - 1) System.out.print("]\n");
	}
	  
	  
	}
	
	public Boolean insertarElemento(T dato) {
		boolean resul = false;
		for (int i = 0; i < TAD.size(); i++) {
			if(TAD.get(i) == null) {
				TAD.set(i, dato);
				resul = true;
				i = TAD.size();
			}
		}
		
		return resul;
	}
	
	public Boolean insertElement(T dato, int index) {
		boolean resul = false;
		if(index >= 0 && index < TAD.size() && TAD.get(index) == null) {
			TAD.set(index, dato);
			resul = true;
		}
		
		return resul;
	}
}
