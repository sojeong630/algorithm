import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for (int i = 0; i < c; i++) {
			int student = sc.nextInt();
			int score[] = new int [student];
			double sum = 0;
			
			for (int j = 0; j < student; j ++) {
				score[j] = sc.nextInt();
				sum = sum + score[j];
			}
			
			double average = sum / student;
			double count = 0;
			
			for(int k = 0; k < student; k++) {
				if(score[k] > average) {
					count += 1;
				}
			}
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
		sc.close();
	}

}
