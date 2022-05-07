import java.io.*;


public class problem {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		String str1 = br.readLine().replace(" ", "");
		int count = 0;
		for (int i =0;i<n1;i++) {
			if (str1.charAt(i) == '1') {
				count++;
			}
		}
		if (count>0) {
			System.out.println("HARD");
			
		}
		else {
			System.out.println("EASY");
		}
	}

}
