import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //몇 개 입력?
		
		int count = 0; // 소수 개수를 세는 변수
		
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			int flag = 0; // 소수 판달할 때 쓸 변수

			for (int k = 2; k < number; k++) {
				
				if (number % k == 0) {
					flag ++;
					break;
				}
			}
			if (flag == 0 && number > 1) count++;
		}
		
		System.out.println(count);
				
		sc.close();
	}

}
