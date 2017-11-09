package tjt003_languageBasics;

public class IfElseDemo {

	public static void main(String[] args) {

		int score = 76;
		char grade;
		
		if (score>90) {
			grade = 'A';
			System.out.println("Grade: "+grade);
		}else if (score>80) {
			grade = 'B';
			System.out.println("Grade: "+grade);
		}else if (score>70) {
			grade = 'C';
			System.out.println("Grade: "+grade);
		}else if (score>60) {
			grade = 'D';
			System.out.println("Grade: "+grade);
		}else if (score>50) {
			grade = 'E';
			System.out.println("Grade: "+grade);
		}else {
		
			grade = 'F';
			System.out.println("Grade: "+grade);
		}
	}

}
