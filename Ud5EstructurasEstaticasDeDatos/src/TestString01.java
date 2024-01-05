
public class TestString01 {
    public static void main(String[] args) {
        // Ejemplo de trim()
        String textoConEspacios = "   Hola, soy una cadena con espacios   ";
        String textoSinEspacios = textoConEspacios.trim();

        System.out.println("Resultado de trim():");
        System.out.println("Texto con espacios: " + textoConEspacios);
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        // Ejemplo de indexOf()
        String otraFrase = "Hola, ¿cómo estás?";
        int posicion = otraFrase.indexOf("cómo");

        System.out.println("\nResultado de indexOf():");
        System.out.println("La subcadena 'cómo' comienza en la posición: " + posicion);
        
        
        
        // Otro ejemplo de uso indexOf()
        String carateresEspeciales = "!?$&%_-";

        char caracterABuscar = '$';
        boolean encontrado = false;
        System.out.println("\nResultado de indexOf():");
        System.out.println("Buscar caracter '" + caracterABuscar + "'" + " en cadena \"" + carateresEspeciales + "\"");
        for(int i = 0; i < otraFrase.length(); i++) {
        	if(carateresEspeciales.indexOf(caracterABuscar) != -1) {
        		encontrado = true;
        		break;
        	} 
        }
        
        if (encontrado) {
    		System.out.println("El caracter " +  caracterABuscar + " encontrado.");
        } else {
    		System.out.println("El caracter '" +  caracterABuscar + "' NO encontrado.");
        }
        
        // Ejemplo de charAt()
        String palabra = "Java";
        char tercerCaracter = palabra.charAt(2);

        System.out.println("\nResultado de charAt():");
        System.out.println("El tercer carácter de la palabra 'Java' es: " + tercerCaracter);

       
        // Ejemplo de split()
        String nombrePersonaje = "Rafael Nadal Parera";					//El metodo split separa las cadenas por el parametro que le indiquemos " "(separado por espacios)
        String[] partesDelNombre = nombrePersonaje.split(" ");
        
        //Ejemplo de replaceAll
        String nuevoNombre = nombrePersonaje.replaceAll(" ", ",");		// Reemplaza los espacios por ,
        System.out.println(nuevoNombre);

        String nombre = partesDelNombre[0];
        String apellido1 = partesDelNombre[1];
        String apellido2 = partesDelNombre[2];

        System.out.println("\nResultado de split():");

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);

        // Ejemplo de substring()
        String otraFraseMas = "Java es divertido";						//la parte de la cadena comprendida entre las posiciones indicadas, la ultima posicion no la coge
        String subcadena = otraFraseMas.substring(5, 10);
        
        System.out.println("\nResultado de substring():");
        System.out.println("La subcadena de la posición 5 a 10 es: " + subcadena);
    }
}
