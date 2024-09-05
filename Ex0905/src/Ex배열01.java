import java.util.Arrays;

public class Ex배열01 {

	public static void main(String[] args) {
		
		// 배열(array) : 같은 타입의 여러 개 데이터를 하나의 묶음으로 다루는 방법
		//              (순차적으로 데이터를 다룬다 --> 인덱스)
		
		// 10, 20, 30, 100
		int array[] = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 100;
//		array[4] = 0;
		
		int array2[] = {10,20,30,100};
		
		
		// 파이썬과 자바 배열 차이점
		// 1. 자바에서의 배열은 한 가지 타입의 데이터만 다룰 수 있다.
		// 2. 자바에서의 배열은 크기가 고정적이다!
		
		System.out.println("배열 크기 : " + array.length);
		
		// array에 있는 모든 데이터를 출력
		System.out.println(array);  // --> [I@6842775d --> 주소값 출력됨!

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// import java.util.Arrays; 해주어야 함!
		System.out.println(Arrays.toString(array));
	}

}
