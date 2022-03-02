import java.math.BigInteger;

public class calc {

	public static void main(String[] args) {
		int type = 1;
		
		BigInteger first = new BigInteger("100");
		BigInteger second = new BigInteger("2");
		
		BigInteger added = first.add(second);
		BigInteger subtracted = first.subtract(second);
		BigInteger multiplyd = first.multiply(second);
		BigInteger divided = first.divide(second);
		
		if(type == 1) {
			System.out.println(added);
		} else if (type == 2) { 
			System.out.println(subtracted);
		} else if (type == 3) {
			System.out.println(multiplyd);
		} else if (type == 4) {
			System.out.println(divided);
		} else {
			System.out.println("Error: You must select a number between 1 - 4.");
		}
		
	}

}
