package recursion01;

public class Factorial {

	public static void main(String[] args) {
		int f=factorial(6);
		System.out.println("Resultado: " + f);
	}
	
	
	public static int factorial(int a) {
			
		if (a==1) {
			return 1;
		}else {
			return a *  factorial(a-1);
		}
	}

}
