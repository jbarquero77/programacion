package OtraVez;

public class CuentaDigitos {

	public static void main(String[] args) {
		int num = 10000;
		
		int contador =0;
		
		do {
			num= num/10;
			contador++;
		}while(num!=0);
		System.out.println(contador);
	}

}
