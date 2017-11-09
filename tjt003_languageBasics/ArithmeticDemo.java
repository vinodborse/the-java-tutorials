package tjt003_languageBasics;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		int result = 1+2;
		// result is 3
		System.out.println("1 + 2 = "+result);
		int originalResult = result;
		
		result = result - 1;
		// now result is 2
		System.out.println(originalResult+" - 1 = "+result);
		originalResult = result;
		
		result = result * 2;
		// now result is 4
		System.out.println(originalResult+" * 2 = "+result);
		originalResult = result;
		
		result = result / 2;
		// now result is 2
		System.out.println(originalResult+" / 2 = "+result);
		originalResult = result;
		
		result = result + 8;
		// now result is 10
		System.out.println(originalResult+" + 8 = "+result);
		originalResult = result;
		
		result = result % 7;
		// now result is 3
		System.out.println(originalResult+" % 7 = "+result);
	
	}

}
