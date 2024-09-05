import java.util.Scanner;

public class Ex배열02 {

	public static void main(String[] args) {
		
		// 1차원 정수형 배열 선언 후, 10개의 공간으로 생성
		// 숫자를 입력받아 3의 배수인 숫자를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수 : ");
		for (int i=0; i < array.length; i++) {
			if (array[i]%3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
	}

}
