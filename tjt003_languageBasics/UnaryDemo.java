package tjt003_languageBasics;

public class UnaryDemo {

	public static void main(String[] args) {
		int result = +1;
		// now result is 1
		System.out.println(result);
		
		result--;
		//now result is 0
		System.out.println(result);
		
		result++;
		// now result is 1
		System.out.println(result);
		
		result = -result;
		// now result is -1
		System.out.println(result);
		
		boolean success = false;
		//false
		System.out.println(success);
		// true
		System.out.println(!success);

	}

}
