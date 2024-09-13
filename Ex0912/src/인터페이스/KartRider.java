package 인터페이스;

public interface KartRider {

	// 인터페이스 : 프로젝트 시작시 어떤 기능을 반드시 만들건지 정의하는 설계도
	// 의무성을 주입해서 정의! --> 추상메소드만 사용 가능하다!
	
	
	// 상수 --> final (생략 가능)
	int number = 10;
	// final int number = 10; 
	
	int startPoint = 10;
	
	
	// 1. 전진
	// public abstract void go();
	void go();   
	// --> 둘 다 같은 뜻!! (public abstract 생략 가능) 
	

	// 2. 후진
	public abstract void back();
	
	// 3. 부스터
	public abstract void booster();
	
}
