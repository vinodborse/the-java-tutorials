package tjt003_languageBasics;

public class ArrayCopyDemo {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' };

		char[] copyTo = new char[7];

		// copy from 2nd position of copyFrom and paste from 0th position at copyTo ,
		// total 7 char
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		// print copyTo
		System.out.println(new String(copyTo));
	}
}
