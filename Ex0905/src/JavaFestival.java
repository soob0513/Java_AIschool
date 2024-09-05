import java.util.Scanner;

public class JavaFestival {

	public static void main(String[] args) {

		// 행의 개수를 입력 받아 삼각형 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------");
		
		// 반대로 출력하기
		System.out.print("행 개수 : ");
		int num2 = sc.nextInt();
		
		for (int i = num2-1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}

}
