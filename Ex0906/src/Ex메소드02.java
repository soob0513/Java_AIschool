import java.util.Scanner;

public class Ex메소드02 {

	public static void main(String[] args) {
		
		// 1. num1, num2, op를 받아 num1과 num2를 op에 맞게 연산한 값 반환
		int num1 = 50;
		int num2 = 15;
		char op ='*';
		
		System.out.println("결과1 : " + cal(num1, num2, op));

		// 2. 입력 받아서 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 >> ");
		int num3 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num4 = sc.nextInt();
		System.out.print("연산자 입력 >> ");
		// 문자열 -> 문자로 이루어진 배열
		// toCharArray() : "abc" -> ['a', 'b', 'c']
		char op2 = sc.next().toCharArray()[0];
		char op3 = sc.next().charAt(0);
		
		System.out.println(op2 + "한 결과2 : " + cal(num3, num4, op2));
		
	}

	public static int cal(int num1, int num2, char op) {
		
		if(op == '+') {
			return num1 + num2;
		}else if(op == '-') {
			return num1 - num2;
		}else if(op == '*') {
			return num1 * num2;
		}else if(op == '/') {
			return num1 / num2;
		}
		
		// 나머지 경우에 반환할 값을 적어주어야 함!
		return 0;
		
		/*
		int result = 0;
		
		if(op == '+') {
			result =  num1 + num2;
		}else if(op == '-') {
			result =  num1 - num2;
		}else if(op == '*') {
			result =  num1 * num2;
		}else if(op == '/') {
			result =  num1 / num2;
		}
		
		return result;
		*/
	}
	
	// void : 반환하지 않겠습니다!
	public static void cal2(int num1, int num2, char op) {
		
		System.out.println("void 함수 print문");
	}
}
