package recursion01;

public class arrayAdd {

	public static void main(String[] args) {
		
		int array [] = {1,3,4};
		 
		System.out.println(add(array));
		
	}
	
	public static int add(int array []) {
		int add = array[0];
		if(array.length==1) {
			return array[0];
		}else{
			for (int i=0; i<array.length-1; i++) {
				add +=  array[i+1];
			}
		}
		return add;
		
		
		}
}

