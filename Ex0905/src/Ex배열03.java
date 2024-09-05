import java.util.Scanner;

public class Ex배열03 {

	public static void main(String[] args) {
		
		// 입력한 점수 중 최고 점수와 최저 점수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1)+"번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
			if (max < array[i]) {
				max = array[i];
			}else if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println();
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
	}

}
