import java.util.ArrayList;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //number of students
		int y = sc.nextInt(); //number of questions
		sc.nextLine(); //CONSUMES THE NEXTLINE, ITS VERY IMPORTANT
		
		ArrayList<String> answerArrayList = new ArrayList<String>();
		ArrayList<Integer> pointsArrayList = new ArrayList<Integer>();
		
		String tempAnswer;
		int tempPoints;
		
		for (int i=0;i<x;i++) {
			
			tempAnswer = sc.nextLine();
			answerArrayList.add(i,tempAnswer);
			//test results ABCDE
			//if ABCD and ABCE combine both so it will be 16 MAX. for BOTH STUDENTS
		}
		for (int i=0;i<y;i++) { //has to do with number of questions
			tempPoints = sc.nextInt();
			//sc.nextLine(); //CONSUMES NEWLINE
			pointsArrayList.add(i,tempPoints);
		}
		
		//ABCD is 1+2+3+4 = 10
		//ABCE is 1+2+3+4 = 10
		//diff in last 4 so use one four, 1+2+3+4+1+2+3 = 16
		//so if diff use one of the points
		//if same use both
		for (int i=1;i<x+1;i++) {
			if (answerArrayList.get(i).equals(answerArrayList.get(i-1)));{
				System.out.println("gamed");
			}
				
		}
		
	}

}
