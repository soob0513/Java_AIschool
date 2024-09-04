import java.util.Scanner;

public class ExWhile01 {

	public static void main(String[] args) {
		
		// while 문 : 반복 횟수가 정해져 있지 않을 때 사용하는 반복문
		
		// 사용자로부터 정수를 입력받기
		// 단, 10보다 작은 숫자를 입력했을 때만 계속 입력받기!
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 >> ");
//		int num = sc.nextInt();
//		
//		// int num; --> 변수 선언
//		// num = 30;
//		// int num = 50; --> 오류 --> Java는 같은 이름으로 변수를 여러 개 만들 수 없기 때문!
//		
//		while(num < 10) {
//			System.out.print("정수 입력 >> ");
//			num = sc.nextInt();
//		}
		
		// 실습
		// A, B의 숫자를 입력받아 A-B를 계산하는 프로그램
		// 단, 두 수가 모두 0이 입력되면 프로그램 종료
		while (true) {
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();
			System.out.print("B 입력 >> ");
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				System.out.println("종료 되었습니다.");
				break;
			}
			
			System.out.println("결과 >> "+ (a-b));
		}

		

	}

}
