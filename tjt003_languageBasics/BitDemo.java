package tjt003_languageBasics;

public class BitDemo {

	public static void main(String[] args) {
		int bitmask = 0x000f;
		int value = 0x2222;
		// prints 2
		System.out.println(value & bitmask);
	}

}
