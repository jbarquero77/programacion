package Arrays;
import java.util.Arrays;

public class MayorMenor {

	public static void main(String[] args) {
		Integer[]array = {5, 8, 2, 10, 3, 1, 7};
		encontarMinMax(array);
	}
	
	public static void encontarMinMax(Integer[]array) {
		Arrays.sort(array);
		int min =array[0];
		int max = array[array.length-1];
		
		System.out.println("El número menor es: "+min);
		System.out.println("El número mayor es: "+max);
	}

}
