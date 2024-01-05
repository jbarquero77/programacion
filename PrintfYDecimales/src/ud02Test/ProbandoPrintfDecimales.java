package ud02Test;


public class ProbandoPrintfDecimales {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 3;
		double res = 0;
		
		res = (double) a / b;
		System.out.printf("La división es: %f\n", res);
		//Se pueden imprimir diferentes variables en una misma instrucción
		System.out.printf("La división entre %d y %d es igual a %f \n", a, b, res);
		//2,67
		System.out.printf("%.2f %n", res);
		// 2,67
		System.out.printf("%5.2f %n", res);
		// 2,667
		System.out.printf("%7.3f %n", res);
		//002,667
		System.out.printf("%07.3f %n", res);
		// 2,6667
		System.out.printf("%10.4f %n", res);
		//2,667
		System.out.printf ("%5.3f %n", res);
		// 2,66667
		System.out.printf ("%10.5f %n", res);
		//0000000003
		System.out.printf("%010.0f %n", res);
	}

}
