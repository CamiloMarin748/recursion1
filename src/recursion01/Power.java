package recursion01;

public class Power {

	public static void main(String[] args) {
		int p=power(2,3);
		System.out.println("Resultado: " + p);
	}
	
	
	public static int power(int a, int b) {
			
		if (b==0) {
			return 1;
		} else 
			if(a*b==a) {
			return a;
		}
		else {
			return a *  power(a, b-1);
		}
	}
	
	
}
