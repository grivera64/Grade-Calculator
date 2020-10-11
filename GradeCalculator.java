import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		//setting up keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//name variable
		String fullName;
		
		//naming test variables
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		double testAvg = 0.0;
		double testPercent = 0.0;
		
		
		//quiz variable
		double quiz1 = 0.0;
		double quizPercent = 0.0;
		
		//assessment variable
		double assess1 = 0.0;
		double assessPercent = 0.0;
		
		double totalPoints = 0.0;
		char letterGrade = 'I';
		boolean isWorking = true;
		
		//System.out.print("Enter student name\t\t    :   ");
		fullName = keyboard.nextLine();
	
		//System.out.print("Enter first exam score\t\t    :   ");
		test1 = keyboard.nextInt();
		if (!(test1 >= 0 && test1 <= 100))
		{
			System.out.println("Test score 1 is not valid, must be between 0 - 100 inclusive.");
			isWorking = false;
		}
		else
		{
			isWorking = true;
		}
		
		if (isWorking) 
		{	
			//System.out.print("Enter second exam score       :    ");
			test2 = keyboard.nextInt();
		
			if (!(test2 >= 0 && test2 <= 100))
			{
				System.out.println("Test score 2 is not valid, must be between 0 - 100 inclusive.");
				isWorking = false;
			}
			else
			{
				isWorking = true;
			}
		}
		
		if (isWorking) 
		{	
			//System.out.print("Enter third exam score\t\t   :   ");
			test3 = keyboard.nextInt();
			
			if (!(test3 >= 0 && test3 <= 100))
			{
				System.out.println("Test score 3 is not valid, must be between 0 - 100 inclusive.");
				isWorking = false;
			}
			else
			{
				isWorking = true;
			}
		}
		
		if (isWorking) 
		{	
			//System.out.print("Enter quiz score\t\t\t :    ");
			quiz1 = keyboard.nextDouble();
		
			if (!(quiz1 >= -0.0001 && quiz1 <= 100.0001))
			{
				System.out.println("Quiz score is not valid, must be between 0 - 100 inclusive.");
				isWorking = false;
			} 
			else
			{
				isWorking = true;
			}
		}
		
		if (isWorking) 
		{	
			//System.out.print("Programming total     \t\t     :    ");
			assess1 = keyboard.nextDouble();
		
			if (!(assess1 >= 0 && assess1 <= 100))
			{
				System.out.println("Programming assignment score is not valid, must be between 0 - 100 inclusive.");
				isWorking = false;
			} 
			else
			{
				isWorking = true;
			}
		}
		
		//calculations
		if (isWorking)
		{
			testAvg = ((double)(test1 + test2 + test3)) / 3;
			testPercent = testAvg * 0.6;
			totalPoints += testPercent;
			quizPercent = quiz1 * 0.1;
			totalPoints += quizPercent;
			assessPercent = assess1 * 0.3;
			totalPoints += assessPercent;
		}
		
		
		if (isWorking)
		{
			if (totalPoints >= 89.99999)
			{
				letterGrade = 'A';
			}
			else if (totalPoints >= 79.9999)
			{
				letterGrade = 'B';
			}
			else if (totalPoints >= 69.99999)
			{
				letterGrade = 'C';
			}
			else if (totalPoints >= 59.99999)
			{
				letterGrade = 'D';
			}
			else if (totalPoints >= -0.00001)
			{
				letterGrade = 'F';
			}
			else {
				System.out.println("Cannot find letter grade");
				letterGrade = 'I';
			}
			
			//showing
			System.out.printf("Hello %s, here is your report: \n", fullName);
			System.out.printf("     Test Scores:%31d, %d, %d\n", test1, test2, test3);
			System.out.printf("     Tests percentage: %28.2f\n", testPercent);
			System.out.printf("     Quiz percentage:%29.2f\n", quizPercent);
			System.out.printf("     Programming Assignment percentage:%11.2f\n", assessPercent);
			System.out.printf("     Total Course Percentage:%22.2f\n", totalPoints);
			System.out.printf("     Letter grade for the course:%13c\n", letterGrade);
		}
		else
		{
			System.out.println("Program stopped working.");
		}
		

	}

}
