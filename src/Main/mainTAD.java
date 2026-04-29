package Main;

import java.util.Scanner;

import TADArrayList.TADArrList;

public class mainTAD {
	public static void main(String[] args) {
		TADArrList<Integer> TADList = new TADArrList<Integer>("Lista De Nombres");
		Scanner input = new Scanner(System.in);
		Integer n = 0, elemento = 0, antiguo = 0, nuevo = 0, index = 0, dato = 0;
		boolean on = false;
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("                   TAD ArrayList                   ");
			System.out.println("---------------------------------------------------");
			System.out.println("---------------------------------------------------");
			System.out.println("Cuantos elementos enteros desea agregar a la lista?");
			System.out.println("---------------------------------------------------");
			if (!input.hasNextInt()) {
				System.out.println("---------------------------------------------------");
				System.out.println("       Error: Ingrese un numero entero valido      ");
				System.out.println("---------------------------------------------------");
				input.nextLine();
				on = false;
			} else {
				n = input.nextInt();
				if (n <= 0) {
					System.out.println("---------------------------------------------------");
					System.out.println("       Error: Ingrese un numero entero Positivo    ");
					System.out.println("---------------------------------------------------");
					input.nextLine();
					on = false;
				} else {
					on = true;
				}
			}
		} while (!on); // mientras on sea falso, se repetira
		input.nextLine();
		System.out.println("---------------------------------------------------");
		System.out.println("Ingrese los elementos enteros a agregar a la lista");
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < n; i++) {
			System.out.print("Elemento [" + i + "]: ");
			if (!input.hasNextInt()) {
				System.out.println("---------------------------------------------------");
				System.out.println("       Error: Ingrese un numero entero valido      ");
				System.out.println("---------------------------------------------------");
				input.nextLine();
				i--;
			} else {
				elemento = input.nextInt();
				if (elemento <= 0) {
					System.out.println("---------------------------------------------------");
					System.out.println("       Error: Ingrese un numero entero Positivo    ");
					System.out.println("---------------------------------------------------");
					input.nextLine();
					i--;
				} else {
					TADList.insertarElemento(elemento); // se inserta elementos en el arrayList
					input.nextLine();
				}
			}
		}

		System.out.println("---------------------------------------------------");
		System.out.println("          Lista De Elementos Ingresados");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector(); // imprime el ArrayList
		System.out.println("---------------------------------------------------");
		System.out.println("Ingrese el Indice Del Elemento Que Desea Modificar");
		System.out.println("---------------------------------------------------");
		System.out.println("Recuerda que el indice esta entre 0 y " + (TADList.longitud() - 1));
		System.out.println("---------------------------------------------------");
		System.out.print("Ingrese Indice: ");
		index = input.nextInt();
		input.nextLine(); // limpia
		System.out.print("Ingrese Nuevo Valor: ");
		nuevo = input.nextInt();
		input.nextLine(); // limpia
		TADList.modificarElementoIndice(nuevo, index);
		System.out.println("---------------------------------------------------");
		System.out.println("          Lista De Elementos Modificada");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector(); // imprime el ArrayList modificado
		System.out.println("---------------------------------------------------");
		System.out.println("         Modificar Por Elemento Existente          ");
		System.out.println("---------------------------------------------------");
		System.out.print("Ingrese El Elemento A Modificar: ");
		antiguo = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese El Nuevo Elemento");
		nuevo = input.nextInt();
		input.nextLine();
		TADList.modificarElementoDato(antiguo, nuevo);
		System.out.println("---------------------------------------------------");
		System.out.println(" 	   Lista De Elementos Modificada Por Dato     ");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector(); // imprime el ArrayList modificado por dato
		System.out.println("---------------------------------------------------");
		System.out.println("            Buscar Elemento En La Lista            ");
		System.out.println("---------------------------------------------------");
		System.out.println("    Ingrese El Elemento A Buscar En La Lista: ");
		System.out.println("---------------------------------------------------");
		dato = input.nextInt();
		input.nextLine();
		index = TADList.buscarElemento(dato);
		System.out.println("---------------------------------------------------");
		System.out.println("    Dato Encontrado En El Indice [" + index + "]");
		System.out.println("---------------------------------------------------");
		System.out.println("                Lista De Elementos                 ");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector();
		do {
		System.out.println("---------------------------------------------------");
		index = 0;
		System.out.println("			Eliminar Elemento Por Indice          ");
		System.out.println("---------------------------------------------------");
		System.out.println("     Ingrese El Indice Del Elemento A Eliminar     ");
		System.out.println("---------------------------------------------------");
		index = input.nextInt();
		if(index < 0 || index >= TADList.longitud()) {
			System.out.println("---------------------------------------------------");
			System.out.println("      Error: Indice Invalido, Ingrese Un Indice Valido ");
			System.out.println("---------------------------------------------------");
		}
		}while(index < 0 || index >= TADList.longitud());
		input.nextLine();
		if ((TADList.eliminarElementoIndice(index))) {
			System.out.println("---------------------------------------------------");
			System.out.println("          Elemento Eliminado Correctamente         ");
			System.out.println("---------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------");
			System.out.println("      Error: Indice Invalido O Elemento Nulo       ");
			System.out.println("---------------------------------------------------");
		}
		System.out.println(" 			  Lista De Elementos                 ");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector();
		System.out.println("---------------------------------------------------");
		System.out.println("           Eliminar Elemento Por Dato              ");
		System.out.println("---------------------------------------------------");
		dato = input.nextInt();
		input.nextLine();
		System.out.println("---------------------------------------------------");
		if((TADList.eliminarElementoDato(dato))) {
			System.out.println("---------------------------------------------------");
			System.out.println("          Elemento Eliminado Correctamente         ");
			System.out.println("---------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------");
			System.out.println("      Error: Elemento No Encontrado O Nulo        ");
			System.out.println("---------------------------------------------------");
		}
		System.out.println("---------------------------------------------------");
		System.out.println(                "Lista Elementos Final              ");
		System.out.println("---------------------------------------------------");
		TADList.imprimirVector();
		System.out.println("---------------------------------------------------");
		input.close();
	}
}

