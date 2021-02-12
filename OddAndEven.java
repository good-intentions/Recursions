package Recursions;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(odd(5)) { 
			System.out.print("Raboti");
		}
		if(even(4)){
			System.out.print("Funkcionira");
		}

	}
	public static boolean even(int x) {
		
		if(x==1) {
			return false;
		}
		if(x==0) {
			return true;
		}
		//else if (x>1) {
		return even(x-2);
		//}
		
	}
    public static boolean odd(int x) {
		if(x==1) {
			return true;
		}else if(x==0) {
			return false;
		}
		return	odd(x-2);
		
	}

}
