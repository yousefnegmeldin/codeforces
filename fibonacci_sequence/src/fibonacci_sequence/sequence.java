package fibonacci_sequence;

public class sequence {

	public static void main(String[] args) {
		int maxValue = 10000;
		int num = 2;
		int display =0;
		while (num<maxValue) {
			if (num ==0) {
				num = 0;
			}
			else if (num ==1) {
				num=1;
			}
			else {
				display = (num-2) +(num-1);
				num++;
			}
			System.out.println(display);
		}

	}

}
