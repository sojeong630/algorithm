import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 숫자 N을 받음. 0<=N<=99
		int N_10 = N / 10;
		int N_1 = N % 10;
		int count = 0; //사이클 세는 수 
		int tmp;
		
		while(true) {
			count++;
			
			tmp = N_10;
			N_10 = N_1;
			N_1 = (tmp+N_1) % 10;
			if(N == N_10 * 10 + N_1)
				break;
		}
		
		System.out.println(count);
		
		
		sc.close();
	}

}