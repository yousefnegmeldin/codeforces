import java.util.Arrays;
import java.util.Scanner;

public class important {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //# of students
		int m = sc.nextInt(); //# of questions
		sc.nextLine(); //consumes newline
		
		String[] answerArray = new String[n];
		Integer[] pointsArray = new Integer[m];
		
		for (int i=0;i<n;i++) {
			answerArray[i]= sc.nextLine();
		}
		
		for (int i=0;i<m;i++) {
			pointsArray[i] = sc.nextInt();
		}
		
		int[] freq =new int[26];
		int count =0;
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				freq[answerArray[j].charAt(i) - 'A']++;
			}
			int max = Integer.MIN_VALUE;
			
			for (int j=0;j<26;j++) {
				if (freq[j]>max) {
					max = freq[j];
				}
			}
			count += max * pointsArray[i];
			Arrays.fill(freq, 0);
		}
		System.out.println(count);
	}

}
