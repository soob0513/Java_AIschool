import java.util.Scanner;

public class Ex조건문03 {

	public static void main(String[] args) {

		// switch ~ case문 : 여러 개의 조건(값)을 비교할 때
		
		// 사용자로부터 입력받은 월에 따라 계절 출력
		// 1,2,12 -> 겨울 / 3,4,5 -> 봄 / 6,7,8 -> 여름 / 9,10,11 -> 가을
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		int month = sc.nextInt();
		
//		switch(기준값) {
//		case 비교값 :
//			기준값과 비교값이 같을 때 실행할 로직
//		}
		
		switch (month) {
		case 1,2,12 : 
			System.out.println("겨울");
			break;
		case 3,4,5 :
			System.out.println("봄");
			break;
		case 6,7,8 :
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		default :
			System.out.println("1~12까지만 입력해주세요");
		}
		
		
		// 실습
		// int 타입의 변수 grade -> 학점 출력
		System.out.print("성적 입력 >> ");
		int grade = sc.nextInt();

		switch(grade/10) {
		case 10 :
		case 9 :
			System.out.println("A학점 입니다.");
			break;
		case 8 :
			System.out.println("B학점 입니다.");
			break;
		case 7 :
			System.out.println("C학점 입니다.");
			break;
		default :
			System.out.println("휴학ㄱ");
		}
	}

}
