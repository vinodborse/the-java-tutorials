package tjt003_languageBasics;

public class ConditionalDemo1 {

	public static void main(String[] args) {
		
		int value1 = 1;
		int value2 = 2;
		
		if ((value1 == 1) && (value2 == 2))
			System.out.println("Value1 is 1 AND value2 is 2");
		
		if ((value1 == 1 ) || (value2 == 2))
			System.out.println("Value1 is 1 OR value2 is 2");
	}
}
