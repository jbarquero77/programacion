public class TestCharacter01 {

    public static void main(String[] args) {
        // Ejemplo 1: Verificar si un carácter es una letra mayúscula o minúscula
        char ch = 'A';

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " es una letra mayúscula");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " es una letra minúscula");
        } else {
            System.out.println(ch + " no es una letra");
        }

        // Ejemplo 2: Convertir un carácter a minúscula o mayúscula
        char letraMayuscula = Character.toUpperCase('a');
        char letraMinuscula = Character.toLowerCase('Z');

        System.out.println("Letra mayúscula: " + letraMayuscula);
        System.out.println("Letra minúscula: " + letraMinuscula);

        // Ejemplo 3: Verificar si un carácter es un dígito
        char digito = '5';

        if (Character.isDigit(digito)) {
            System.out.println(digito + " es un dígito");
        } else {
            System.out.println(digito + " no es un dígito");
        }

        // Ejemplo 4: Verificar si un carácter es un carácter de espacio en blanco
        char espacio = ' ';

        if (Character.isWhitespace(espacio)) {
            System.out.println("El carácter es un espacio en blanco");
        } else {
            System.out.println("El carácter no es un espacio en blanco");
        }

        // Ejemplo 5: Convertir un carácter a su valor numérico
        char caracter = '7';
        int valorNumerico = Character.getNumericValue(caracter);

        System.out.println("El valor numérico de " + caracter + " es " + valorNumerico);
   
        // Ejemplo 6: Verificar si un carácter es un carácter de puntuación
        char punto = '.';
        if (Character.isLetterOrDigit(punto)) {
            System.out.println(punto + " es una letra o un dígito");
        } else {
            System.out.println(punto + " no es una letra ni un dígito");
        }

        // Ejemplo 7: Comparar dos caracteres ignorando mayúsculas/minúsculas
        char char1 = 'a';
        char char2 = 'A';

        if (Character.toUpperCase(char1) == Character.toUpperCase(char2)) {
            System.out.println(char1 + " y " + char2 + " son iguales (ignorando mayúsculas/minúsculas)");
        } else {
            System.out.println(char1 + " y " + char2 + " son diferentes (ignorando mayúsculas/minúsculas)");
        }

   
        // Ejemplo 8: Convertir un carácter a su representación en cadena
        char letra = 'X';
        String cadena = Character.toString(letra);

        System.out.println("La representación en cadena de " + letra + " es '" + cadena + "'");
    }
}
