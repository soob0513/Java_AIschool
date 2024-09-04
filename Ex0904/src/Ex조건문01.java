import java.util.Scanner;

public class Ex조건문01 {

	public static void main(String[] args) {
		
//		// 사용자로부터 나이를 입력받아주세요!
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이 입력 >> ");
//		int age = sc.nextInt();
//		
//		// 만약 입력받은 나이가 20보다 크다면 "성인입니다" 출력
//		// 조건식은 반드시 true or false 로 와야한다!
//		if (age > 20) {
//			System.out.println("성인입니다");
//		}
//		// else : 주어진 조건이 거짓일 때 실행할 로직
//		else {
//			System.out.println("미성년자입니다.");
//		}
		
		
		// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num % 10 >= 5) {
			System.out.println("반올림 수 : " + (num + (5-(num%5))));
			// System.out.println(num/10*10+10);
		}else {
			System.out.println("반올림 수 : " + (num - (num%10)));
			// System.out.println(num/10*10);
		}
		
		System.out.println("종료!");
		
	}

}
