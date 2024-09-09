
public class Phone {
	
	// 클래스 : 사용자 임의의 자료형!
	
	// 1. 데이터(속성) -< field
	// 전화번호
//	String number = "01047685180";
	String number;  // -> null 값
	// 기종
//	String kind = "iphone14";
	String kind;
	// 통신사
//	String tel = "SK";
	String tel;
	
	// 생성자 : 객체를 만들 때 클래스의 공간을 만들어주는 기능(메소드)
	//    특징1. 반환타입 자체가 없다.
	//    특징2. 생성자의 이름은 클래스명과 동일해야만 한다!
	
	// 생성자 오버로딩(중복정의) : 매개변수만 바꿔서 메소드를 중복정의
	// default 생성자 --> 다른 생성자가 만들어지기 전까지만 사용 가능하다!
	// default 생성자 지우면 Phone p1 = new Phone(); 에서 오류남
	public Phone() {
		
	}
	public Phone(String number, String kind, String tel) {
		// 위에 선언해준 변수들이랑은 다른 값들이다
		// -> 세 개의 매개변수들을 받아서 위에 선언해준 변수들에 담아주겠습니다!
		
		// this -> 이 클래스를 가리킴
		this.number = number;
		this.kind = kind;
		this.tel = tel;
	}
	
	
	// 2. 기능(행동, 로직) -> method
	// 전화를 걸다
	public void call() {
		System.out.println("전화를 걸다");
	}
	// 문자를 보내다
	public void message() {
		System.out.println("문자를 보내다");
	}
	// 인터넷을 하다
	public void internet() {
		System.out.println("인터넷을 하다");
	}
	
	
	
}
