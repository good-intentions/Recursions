package Recursions;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		odd(5);
		even(5);

	}
	public static boolean even(int x) {
		if(x==0) {
			return true;
		}
		else if (x>1) {
			even(x-2);
		}
		return false;
		
	}
    public static boolean odd(int x) {
		if(x==1) {
			return true;
		}else if(x==0) {
			return false;
		}
		
		else  if (x>1) {
			odd(x-2);
		}
		return false;
		
	}

}
