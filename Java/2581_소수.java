import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); 
		int N = sc.nextInt(); // M이상 N이하 자연수 중에서 소수 찾기 
		
		int count = 0; // 소수 개수를 세는 변수
		int sum = 0; // 소수 합을 넣는 변수
		int min = 0; // 소수 최소값을 넣는 변수
		
		for (int i = M; i <= N; i++) {
			
			int flag = 0; // 소수 판달할 때 쓸 변수
		
			for (int k = 2; k < i; k++) {
				
				if (i % k == 0) {
					flag ++;
					break;
				}
			}
			if (flag == 0 && i > 1) {
				sum = sum + i;
				if (min == 0) min = i;
			}
		}
		if (sum == 0) {
			count--;
			System.out.println(count);
		}
		
		else {
			System.out.println(sum);
			System.out.println(min);
		}
				
		sc.close();
	}

}