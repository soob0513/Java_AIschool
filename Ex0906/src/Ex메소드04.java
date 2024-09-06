import java.lang.reflect.Array;

public class Ex메소드04 {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		int num = 10;
		
		
		// call-by-reference : 넘긴 값이 주소값
		myPrint(array);
		// call-by-value : 넘긴 값이 데이터
		myPrint2(num);
		
		System.out.println("array[0] : " + array[0]);  // -> 30
		System.out.println("num : " + num);  // -> 10

	}

	// myPrint() 라는 함수를 만들어서 array에 있는 내용을 전부 출력
	public static void myPrint(int array[]) {
		array[0] = 30;
		
//		for(int i=0; i< array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
	}
	
	public static void myPrint2(int num) {
		num = 30; 
	}
}
