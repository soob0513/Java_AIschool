
public class ExFor01 {

	public static void main(String[] args) {
		
		// for : 반복 횟수가 정해져 있을 때 사용하는 반복문
		// ~언제부터, ~언제까지 명시
		
		// 1부터 5까지 출력 해주세요
		// for (초기화구문; 검사 조건; 반복 후 작업) {
		//     실행할 로직
		// }
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		// Q. i의 마지막 값은? -> 6 
		// ※ 중괄호 안에서 i의 마지막 값은 5이다!
		
		System.out.println("------------------------");
		
		// 실습1. 21부터 57까지 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		// 실습2. 96부터 53까지 출력
		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		// 실습3. 21부터 57까지의 수 중 홀수만 출력
		for (int i = 21; i <= 57; i++) {
			if (i%2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		
		for (int i = 21; i <= 57; i+=2) {
			System.out.print(i + " ");
		}
	}

}
