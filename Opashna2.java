package simeon;

public class Opashna2 {
	

	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));
	}
	
	
	public static int xMethod(int n){
		return xMethod(n, 0);
	}
	
	public static int xMethod(int n, int sum){
		if (n==0) return sum;
		else{
			return xMethod(n-1, sum+n);
		}
	}
//	public static int xMethod(int n) {
//	   	 if (n == 1)
//	   		 return 1;
//	   	 else
//	   		 return n + xMethod(n - 1);
}
