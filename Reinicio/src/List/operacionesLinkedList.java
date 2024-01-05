package List;

import java.util.LinkedList;

public class operacionesLinkedList {

	public static void main(String[] args) {
		LinkedList<String>listaEnlazada = new LinkedList<>();
		
		listaEnlazada.add("Manzana");
		listaEnlazada.add("Banana");
		listaEnlazada.add("Naranja");
		
		listaEnlazada.addFirst("Fresa");
		listaEnlazada.addLast("Kiwi");
		
		System.out.println("Lista enlazada: "+listaEnlazada);

	}
}
