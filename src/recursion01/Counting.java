package recursion01;

public class Counting {

	public static void main(String[] args) {
		int array [] = {2,7,9,13,8};
		evenOdd(array);
	}
	
	
	static int evenOdd (int array[])
    {
        return (evenOdd (array,0,0,0));
    }
	
	
	public static int evenOdd(int [] array, int pos, int even, int odd) {
		
        if(pos<array.length) {
            if(array[pos]%2==0)
            {
            	even +=1;
                System.out.println("pares "+even);
            }else{
            	odd +=1;
                System.out.println("impares "+odd);
            }
            evenOdd(array,pos+1,even,odd);
        }
        return 1;
    }
	
	

}
