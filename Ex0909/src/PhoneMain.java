
public class PhoneMain {

	public static void main(String[] args) {
		
		int num = 30;
		
		String name = "승환";
		
		// 휴대폰
		// new : 공간을 만든다!
		// Phone p1; --> 그냥 변수만 만든 것!
		Phone p1 = new Phone();  // default 생성자
		// -> Phone이라는 자료형의 p1이라는 공간을 만들어서 담아주겠습니다.
		// 생성자 : 클래스 만큼의 공간을 생성
		// Phone() : 생성자 메소드 --> 클래스 생성시 기본적으로 클래스 공간 크기 만큼 만들어짐
		System.out.println(p1.number);
		System.out.println(p1.kind);
		
		p1.call();
		
		// 범식쌤 휴대폰
		Phone p2 = new Phone();
		p2.kind = "iphone";
		p2.number = "01022950023";
		p2.tel = "KT";
		
		// 생성자 메소드 오버로딩 후!
		Phone p3 = new Phone("kind", "iphone", "LG");
		System.out.println(p3.number);
		
		
	}

}
