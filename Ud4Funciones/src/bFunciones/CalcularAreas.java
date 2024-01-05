package bFunciones;

import java.util.Scanner;

public class CalcularAreas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Círculo");
        System.out.println("5. Trapecio");
        System.out.print("Ingresa el número correspondiente a la figura: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                System.out.println("El área del triángulo es: " + calcularArea1(baseTriangulo, alturaTriangulo));
                break;

            case 2:
                System.out.print("Ingresa el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                System.out.println("El área del cuadrado es: " + calcularArea1(ladoCuadrado));
                break;

            case 3:
                System.out.print("Ingresa la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();
                System.out.println("El área del rectángulo es: " + calcularArea1(baseRectangulo, alturaRectangulo));
                break;

            case 4:
                System.out.print("Ingresa el radio del círculo: ");
                double radioCirculo = scanner.nextDouble();
                System.out.println("El área del círculo es: " + calcularArea1(radioCirculo));
                break;

            case 5:
                System.out.print("Ingresa la base mayor del trapecio: ");
                double baseMayorTrapecio = scanner.nextDouble();
                System.out.print("Ingresa la base menor del trapecio: ");
                double baseMenorTrapecio = scanner.nextDouble();
                System.out.print("Ingresa la altura del trapecio: ");
                double alturaTrapecio = scanner.nextDouble();
                System.out.println("El área del trapecio es: " + calcularArea(baseMayorTrapecio, baseMenorTrapecio, alturaTrapecio));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    // Sobrecarga de funciones para calcular el área de las distintas figuras geométricas

    // Área del triángulo
    public static double calcularArea1(double base, double altura) {
        return (base * altura) / 2;
    }

    // Área del cuadrado
    public static double calcularArea1(double lado) {
        return lado * lado;
    }

    // Área del rectángulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Área del círculo
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Área del trapecio
    public static double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

	

}
