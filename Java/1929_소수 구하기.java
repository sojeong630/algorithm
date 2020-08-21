import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); 
		int N = sc.nextInt(); // M이상 N이하 자연수 중에서 소수 찾기 
		
		
		for(int i = M; i <= N; i++) {
			int flag = 0; //소수 확일할 때 쓸 변수

			if (i == 1) flag = 1;
			int number = (int)Math.sqrt(i)+1; // 제곱근 함수
			for(int j = 2; j<number; j++) {
				if(i % j == 0) {
					flag++;
					break;
				}
			}
			
			if(flag == 0) System.out.println(i);
			
			
		}
		
		
		sc.close();
	}

}

// 기존 소수 구하는 방법을 쓰면 범위가 커서 오래걸림. -- 에라토스테네스의 체 이용
// 2의배수 걸러내고, 3의배수 ... 걸러내서 남는 수가 소수