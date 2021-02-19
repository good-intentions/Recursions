package simeon;

public class Opashna2 {
	
	public static int result;

	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));
	}
	
	public static int xMethod(int n){
	
		if (n==0) return result;
		
		else{
			result += n;
			return xMethod(n-1);
		}
		
	}
//	public static int xMethod(int n) {
//	   	 if (n == 1)
//	   		 return 1;
//	   	 else
//	   		 return n + xMethod(n - 1);
}
