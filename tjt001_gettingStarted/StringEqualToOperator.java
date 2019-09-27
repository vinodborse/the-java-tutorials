package tjt001_gettingStarted;

public class StringEqualToOperator {
	
	/**
	 * Example for equals metod in java
	 * 
	 */
	public static void main(String[] args) {
		
		String str1 = "Sample text";
		String str2 = "sample text";
		
		if(str1.equals(str2)) {
			System.out.println("str1 and str2 are equals.");
		}else {
			System.out.println("str1 and str2 are not equals.");
		}
	}

}
