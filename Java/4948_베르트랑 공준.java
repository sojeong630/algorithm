import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if (n == 0) break; //0이면 그만두기
			
			int count = 0; //개수 세는 변수
			
			for(int i = n+1; i <= n*2; i++) {
				int flag = 0; // 소수 판정 변수
				int root = (int)Math.sqrt(i) + 1; //제곱근+1 구하기
				for(int j = 2; j < root; j++) {
					if(i % j == 0) {
						flag ++;
						break;
					}
				}
				if(flag == 0) count++;
			}
			
			System.out.println(count);		
		}
		
		sc.close();
	}

}