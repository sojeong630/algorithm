import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); //시간
		int M = sc.nextInt(); //분
	
		if (M >= 45) {	// 분이 45 분 이상이면 빼고 끝
			M = M - 45;
		}
		else {
			if (H == 0) { // 0시일 때와 아닐 때 구분
				H = 23;
				M = M + 60 - 45;
			}
			else { // 시간에서 1시간 빼고 분에 60분을 더한 상태에서 빼기 
				H = H - 1;
				M = M + 60 - 45;
			}
		}
		
		
		System.out.print(H + " " + M);
		sc.close();
	}

}