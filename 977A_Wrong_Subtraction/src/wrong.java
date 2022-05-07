import java.util.Arrays;
import java.util.Scanner;
public class wrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		String[] str1list = input1.split(" ");
		String str1 = str1list[0];
		
		int value2 = Integer.parseInt(str1list[1]);
		
		int actualvalue1 = Integer.parseInt(str1list[0]);
		
		int value1index = str1.length();
		
		for (int i=0;i<value2;i++) {
			if (actualvalue1 % 10 != 0) {
				actualvalue1 -=1;
			}
			else {
				actualvalue1 /=10;
			}
		}
		System.out.println(actualvalue1);
	}

}
