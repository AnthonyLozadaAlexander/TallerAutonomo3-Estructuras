package Main;

import java.util.Scanner;

import TADArrayList.TADArrList;

public class mainTAD {
    public static void main(String[] args) {
    	TADArrList<Integer> TADList = new TADArrList<Integer>("Lista De Nombres"); 
    	Scanner input = new Scanner(System.in);
    	int n = 0, elemento = 0;
    	boolean on = false;
    	do {
    	System.out.println("---------------------------------------------------");
    	System.out.println("                   TAD ArrayList                   ");
    	System.out.println("---------------------------------------------------");
    	System.out.println("---------------------------------------------------");
    	System.out.println("Cuantos elementos enteros desea agregar a la lista?");
    	System.out.println("---------------------------------------------------");
    	if(!input.hasNextInt()) {
			System.out.println("---------------------------------------------------");
			System.out.println("       Error: Ingrese un numero entero valido      ");
			System.out.println("---------------------------------------------------");
			input.nextLine();
			on = false;
    	}else {
    		n = input.nextInt();
    		if(n <= 0) {
    			System.out.println("---------------------------------------------------");
				System.out.println("       Error: Ingrese un numero entero Positivo    ");
				System.out.println("---------------------------------------------------");
				input.nextLine();
				on = false;
    		}else {
    			on = true;
    		}
    	}
    	}while(!on); // mientras on sea falso, se repetira
    	input.nextLine();
    	System.out.println("---------------------------------------------------");
    	System.out.println("Ingrese los elementos enteros a agregar a la lista");
    	System.out.println("---------------------------------------------------");
    	for (int i = 0; i < n; i++) {
			System.out.print("Elemento ["+i+"]: ");
			if(!input.hasNextInt()) {
				System.out.println("---------------------------------------------------");
				System.out.println("       Error: Ingrese un numero entero valido      ");
				System.out.println("---------------------------------------------------");
				input.nextLine();
				i--;
	    	}else {
	    		elemento = input.nextInt();
	    		if(elemento <= 0) {
	    			System.out.println("---------------------------------------------------");
					System.out.println("       Error: Ingrese un numero entero Positivo    ");
					System.out.println("---------------------------------------------------");
					input.nextLine();
					i--;
	    		}else {
	    			TADList.insertarElemento(elemento); // se inserta elementos en el arrayList
	    			input.nextLine();
	    		}
	    	}
			
		}
    	
    }
}
