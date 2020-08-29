package recursion01;

public class Division {

	public static void main(String[] args) {
	int d =div(12,3);
	System.out.println("Resultado: " + d);
}

	public static int div(int a, int b) {
		if(a-b<0) {
			return 0;
		}
		else {
			return div(a-b, b) + 1 ;
		}
	}
		
	
}
