package TADArrayList;

import java.util.ArrayList;
import java.util.Iterator;

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
		return "TADArrList:" + TAD + "\n" + 
				"Nombre: " + nombre + "\n";
				 
	}
	
	public void imprimirArrayList() {
	  for (int i = 0; i < TAD.size(); i++) {
		  if(i == 0) System.out.print("[");
		 if(i <= TAD.size() - 2) {
			 System.out.print(TAD.get(i) + ", ");
		 }else {
			 System.out.print(TAD.get(i));
		 }
		 
		 if(i == TAD.size() - 1)
		  System.out.print("]\n");
	}
	  
	  
	}
	
	public Boolean insertarElemento(T dato) {
		return TAD.add(dato);
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
