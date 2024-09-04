import java.util.Scanner;

public class Ex조건문02 {

	public static void main(String[] args) {
		
		// 다중 if문
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		// 나이가 8살 이상, 20살 미만이라면 '학생입니다!'
		if (age > 20) {
			System.out.println("성인 입니다.");
		}else if (age >= 8) {
			// 조건문 안에 age >= 8 && age < 20 이라고 안 적어줘도 된다
			// 8 <= age < 20  -> 안 됨!
			System.out.println("학생입니다!");
		}else {
			System.out.println("미성년 입니다.");
		}
		
		// 실습
		// int 타입의 변수 grade -> 학점 출력
		System.out.print("성적 입력 >> ");
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.println("A학점 입니다.");
		}else if (grade >= 80) {
			System.out.println("B학점 입니다.");
		}else if (grade >= 70) {
			System.out.println("C학점 입니다.");
		}else {
			System.out.println("휴학ㄱ");
		}
		
		
	}

}
