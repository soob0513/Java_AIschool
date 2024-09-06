
public class Ex메소드03 {

	public static void main(String[] args) {
		
		// 약수를 구하는 getDivisor() 메소드 구현하기
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		getDivisor(30);
		getDivisor(56);
		
	}
	
	public static void getDivisor(int num) {
		
		System.out.print(num + "의 약수 : ");
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	

}
