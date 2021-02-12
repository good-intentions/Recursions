package Recursions;

public class Dec2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(dec2Bin(2345));

	}
	public static String dec2Bin(int x) {
		if(x==0) {
			return "";
		}else {
			return "" + x%2 + dec2Bin(x/2);
		}
	}
}
