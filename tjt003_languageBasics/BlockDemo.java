package tjt003_languageBasics;

public class BlockDemo {

	public static void main(String[] args) {
		boolean condition = true;
		
		if (condition) { // begin block 1
			System.out.println("Condition is true.");			
		} // end block 2
		else { // begin block 2
			System.out.println("Condition is false");
		} // end block 2
	}
}