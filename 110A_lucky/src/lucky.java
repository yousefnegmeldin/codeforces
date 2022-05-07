import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lucky {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string1 = br.readLine();
		int count = 0;
		
		for (int i =0;i<string1.length();i++) {
			if(string1.charAt(i) == '4' || string1.charAt(i)=='7') {
				count++;
			}
			
		}
		if (count == 4 || count == 7) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
	}

}
