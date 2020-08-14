import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //여자
		int M = sc.nextInt(); //남자
		int K = sc.nextInt(); //인턴 참가
		
		// 여자 2명 남자 1명이 한 팀 K명은 반드시 인턴쉽 참가해야함. 
		// 최대한 많은 팀을 만들어야 함
		
		int team = 0;
				
		while (N > 1 && M > 0) { //여자는 2명씩 짝 지으니까 1보다 클 때, 남자는 1명씩이니 0보다 클때까지
			N = N - 2;
			M = M - 1; // 2:1로 팀짜주기
			team = team + 1;
		}
		
		K = K - N - M; //나머지 멤머를 인턴에서 빼줌
		
		while (K > 0) { //인턴으로 나가야 할 멤버가 더 있다면 
			team = team - 1;
			K = K - 3;
		}
		
		System.out.println(team);
		
		sc.close();
	}

}