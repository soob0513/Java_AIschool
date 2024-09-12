package 추상클래스;

public class 자동차Main {

	public static void main(String[] args) {
		
		// 수소자동차 달리기
		수소자동차 car1 = new 수소자동차();
		car1.run();
		
		// 자동차 달리기
		// 추상 클래스는 객체를 생성할 수 없다!
		// 자동차 car2 = new 자동차();
		// --> 업캐스팅해서 사용!
		// 객체를 생성할 수는 없지만 업캐스팅을 통해 하위클래스 객체들을 다룰 수 있다
		자동차 car2 = car1;
		
		
	}

}
