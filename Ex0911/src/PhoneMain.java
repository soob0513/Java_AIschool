
public class PhoneMain {

	public static void main(String[] args) {
	
		// 부모 객체
		Tel p1 = new Tel();
		p1.call();
		p1.button();
		
		System.out.println("===========");
		
		// 자식 객체
		Folder p2 = new Folder();
		p2.call();
		p2.button();
		p2.open();
		
		System.out.println("===========");
		
		// 자식 객체 2
		Smart p3 = new Smart();
		p3.button();
		
		// ========================================
		// Casting -> 형 변환
		String number = "10";
		int num = Integer.parseInt(number);
		
		// 강제적 형변환 
		// 레퍼런스 변수가 아닌, 기본 타입만 가능! (int/float/double/long/char)
		// String은 기본 타입이 아님.
		int num2 = (int) 3.14;   // --> 3이 들어감!
		
		
		// UpCasting : 하위 클래스 타입 객체 -> 상위 클래스 타입 객체
		// (자동 타입 변환) 
		Folder f1 = new Folder();
		Tel f2 = f1;   // UpCasting
		// 업캐스팅된 객체는 부모 클래스의 내용만 사용 가능!
		// 단, 자식 클래스에 오버라이딩(재정의)한 경우는
		// 업캐스팅 했더라도 자식 클래스에 있는 기능을 이용한다. 
		f2.callSend(); // 부모 클래스의 callSend()
		f2.button();   // 자식 클래스의 button() -> 클릭
//		f2.open();  // 자식클래스에만 있음 -> 인식 안 됨!
	}

}
