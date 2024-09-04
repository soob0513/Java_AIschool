import java.util.Scanner;

public class Ex연산자02 {

	public static void main(String[] args) {
		
		// 1. 대입 연산자  =  , += , -= 
	    int num = 10;
	    // num +1 증가 시키고 싶습니다!
	    num = num+1;
	    num +=1;
	    num++;
	    num--; // -> num -=1 //  num = num-1;
	      
	    // 2. 비교(크기) 연산자 --> true or false
	    //   >  <  >=  <=
	    int data1 = 10;
	    int data2 = 3;
	    System.out.println(data1 > data2);
	    System.out.println(data1 != data2);
	     
	    // 3. 논리 연산자  --> true or false
	    // and(&&)  , or(||) , not
	    boolean data3 = true;
	    boolean data4 = false;
	    System.out.println(data3 && data4); // 전부 다 true -> true
	    System.out.println(data3 || data4); // 하나라도 true -> true

		
		// 4. 삼항 연산자
		// 조건식 ? true일 때 실행부분 : false일 때 실행 부분
		int num2 = 5;
		int num3 = 10;
		
		// num3를 num2로 나누었을 때 나누어 떨어진다면?
		// -> '약수' 출력
		// 나누어 떨어지지 않는다면?
		// -> '약수아님!' 출력
		System.out.println(num3 % num2 == 0 ? "약수" : "약수 아님!");
		
		// 두 개의 정수를 입력받아서
		// 큰 수에서 작은 수를 뺀 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int number1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int number2 = sc.nextInt();
		System.out.print("두 수의 차 : ");
		System.out.println(number1>number2 ? number1-number2 : number2-number1);
		
		}

}
