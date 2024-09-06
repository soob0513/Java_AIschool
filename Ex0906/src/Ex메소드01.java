
public class Ex메소드01 {

	public static void main(String[] args) {
		
		// 메소드 : 기능을 미리 만들어서 필요할 때마다 불러서 사용할 수 있는 문법 
		// 두 개의 숫자를 더하는 기능을 만들어보자
		int num1 = 30;
		int num2 = 60;
		int result = add(num1, num2);
		System.out.println("결과 : " + result);
		System.out.println("결과2 : " + add(num1, num2));
		
		// 사칙연산 메소드 구현
		int addNum = add(3,5);
		int minusNum = minus(3,5);
		int mulNum = mul(3,5);
		int divNum = div(3,5);
		
		System.out.println("더하기 결과 : " + addNum);
		System.out.println("빼기 결과 : " + minusNum);
		System.out.println("곱하기 결과 : " + mulNum);
		System.out.println("나누기 결과 : " + divNum);

	}

	// public : 접근 제한자
	// static : 공유하다 -> main 영역 안에서 불러서 사용할 수 있도록!
	// int : 반환 타입
	// add : 메소드 이름
	// (int num1, int num2) : 매개변수
	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	
}
