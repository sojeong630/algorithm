import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int howMany;
		int sum=0;
		String line;
		
		howMany = in.nextInt();
		line = in.next();
		
		for (int i = 0; i < howMany; i++) {
			int j = line.charAt(i)-48;
			sum = sum + j;
		}
		System.out.println(sum);
	}

}