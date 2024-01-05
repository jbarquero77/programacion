package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElementosUnicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine();
		
		String[]palabras = frase.split(" ");
		Set<String> palabrasUnicas = new HashSet<>();
		
		for (String palabra: palabras) {
			palabrasUnicas.add(palabra);
		}
		
		//Mostrar palabras únicas
		System.out.println("Palabras únicas: "+palabrasUnicas);
		
		
		System.out.print("Palabras únicas: ");
        Iterator<String> iterator = palabrasUnicas.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}

}
