package recursion01;

public class Multiplicacion {

	public static void main(String[] args) {
	int x = m(5,3);
	System.out.println("Resultado: " + x);
}

	public static int m(int a, int b) {
		if(b==1) {
			return a;
		}
		else {
			return a + m(a, b-1);
		}
	}
	
	
}
