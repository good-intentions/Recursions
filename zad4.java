package Recursions;

public class zad4 {
	
	
	public static void main(String[] args) {
	   	 System.out.println(naStepen(5,6) + " = " + naStepen2(5,6));
	}
	
	public static int naStepen(int x , int n) {
		
		if(n==1) {
			return x;
		}
		else return x*naStepen( x,n-1);
	}
	
	public static int naStepen2(int x, int n) {
		int sum = 1;
		for(int i =0; i<n ; i++) {
			sum*=x;
		} return sum;
	}

}
