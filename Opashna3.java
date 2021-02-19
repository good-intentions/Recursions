package simeon;

public class Opashna3 {
		

		public static void main(String[] args) {
		   	 System.out.println("Stepen e " + xMethod(5 , 3));
		}
		
		
		public static int xMethod(int x, int n  ){
			return xMethod( x, n, 1);
		}
		
		public static int xMethod( int x, int n, int result){
			if (n==0) {
				return result;
			}else{
				return xMethod(x ,n-1, result*x);
			}
		}
//	public static int powRecursive( int x, int n ) {
//	   	 if (n == 0) {
//	   		 return 1;
//	   	 }
//	   	 
//	   	 return x * powRecursive(x, n - 1 );
//	    }


}
