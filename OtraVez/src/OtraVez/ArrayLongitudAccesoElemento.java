package OtraVez;

public class ArrayLongitudAccesoElemento {

	public static void main(String[] args) {
		
		int []array=  {1,2,3,4,5};
		
		int suma =0;
		
		for(int num : array) {
			suma+=num;
		}
		System.out.println("Los elementos del array suman: "+suma);
	}

}
