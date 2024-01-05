package OtraVez;

public class SumaPares {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i=0; i<=10;i++) {
			System.out.println(num+" *  "+i+" = "+(num*1));
		}
		System.out.println();
		
		int iterador=1;
		do {
			System.out.println(num+" *  "+iterador+" = "+(num*iterador));
			iterador++;
			}while(iterador<=10);
			

	}

}
