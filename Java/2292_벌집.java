import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int sum = 1;
		int room;
		
		while(true) {
			sum = sum + 6*count;
			count++;
			if(sum >= n) {
				room = count;
				break;
			}
			
		}
		
		
		System.out.println(room);
		
		sc.close();
	}

}
