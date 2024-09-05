
public class ExFor02 {

	public static void main(String[] args) {
		
		// (77*1) + (76*2) + (75*3) + ... + (1*77)를 계산해서 결과 출력하기
		int sum = 0;
		for (int i = 1; i <= 77; i++) {
			sum += (78-i)*i;
		}
		System.out.println(sum);
		
		// 선생님 풀이
		int sum2 = 0;
		for (int i = 77; i >= 1; i--) {
			sum2 += i * (78-i);
		}
		System.out.println(sum2);
		
		// 선생님 풀이2
		int sum3 = 0;
		for (int i = 77, j = 1; i >= 1; i--, j++) {
			sum3 += i*j;
		}
		System.out.println(sum3);
	}

}
