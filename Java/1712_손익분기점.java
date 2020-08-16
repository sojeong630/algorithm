import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt(); // 고정비용
		long B = sc.nextInt(); // 가변비용
		long C = sc.nextInt(); // 노트북 가격
		
		long n = 0; //넘는 개수
		 
		if(C - B <=0) {
			System.out.println("-1");
		}
		else {
			n = (A / (C - B)) + 1;
			System.out.println(n);
		}
		
		
		sc.close();
	}

}
