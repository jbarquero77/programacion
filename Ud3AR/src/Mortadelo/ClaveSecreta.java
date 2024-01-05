/* El Superintendente Vicente está desesperado porque
no se acuerda de la contraseña de la caja fuerte. En
ella está guardado el regalo de aniversario para su
mujer, Felisa. De repente, se produce una explosión en
el laboratorio del Profesor Bacterio y su trofeo más
apreciado del club de petanca le cae en la cabeza.
Después de unos minutos de aturdimiento, el
Superintendente Vicente recoge el trofeo y se da
cuenta que en la base hay un papel con un número
escrito que pone “número secretísimo de la caja fuerte: 7542”.
¡Muy emocionado prueba el número en la caja fuerte, pero... no abre! Sin embargo,
hay esperanzas. En el reverso del mismo papel hay escrito un mensaje que dice lo
siguiente:
“El número secreto tiene que dislocarse, de tal forma que a cada dígito se le suma 1 si
es par y se le resta 1 si es impar”.
Pues eso, escribe un programa que ayude al Superintendente Vicente a desvelar la
clave (no tiene la cabeza para pensar mucho ahora mismo).
*/

package Mortadelo;

import java.util.Scanner;

public class ClaveSecreta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int clave =0;
		int multiplicador = 1;
		
		while (num > 0) {
			
			int digito = num % 10;
			int nuevoDigito;
			
			if(digito %2==0) {
				nuevoDigito = digito +1;
								
			}else {
				nuevoDigito = digito-1;
				
			}
			
			clave += nuevoDigito * multiplicador;
			multiplicador *=10;
			num /=10;
						
		}
		System.out.println(clave);
		
	}

}