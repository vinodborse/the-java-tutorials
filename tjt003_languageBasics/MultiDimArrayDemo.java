package tjt003_languageBasics;


public class MultiDimArrayDemo {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Mr. ","Mrs. ","Ms. "},
				{"James", "Smith"}
		};
		
		//Mr. James
		System.out.println(names[0][0]+names[1][0]);
		//Ms. Smith
		System.out.println(names[0][2]+names[1][1]);
	}
}
