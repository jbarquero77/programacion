package Strings;

public class StringSubcadenaComun {

	public static void main(String[] args) {
		String cadena1 = "abcdxyz";
		String cadena2 = "xyzabcd";
		
		int result = encontrarSubcadena(cadena1,cadena2);
		System.out.println("Longitud de la subcadena común más larga: "+result);
		
	}

	public static int encontrarSubcadena(String cad1, String cad2) {
		int primera = cad1.length();
		int segunda = cad2.length();
		
		int[][] nueva = new int[primera+1][segunda+1];
		int tamanioMaximo =0;
		
		for (int i =1; i<=primera;i++) {
			for(int j=1;j<=segunda;j++) {
				if(cad1.charAt(i-1)== cad1.charAt(j-1)) {
					nueva[i][j] = nueva[i-1][j-1]+1;
					tamanioMaximo = Math.max(tamanioMaximo, nueva[i][j]);
				}else {
					nueva[i][j]=0;
				}
			}
		}
		return tamanioMaximo;
	}
}
