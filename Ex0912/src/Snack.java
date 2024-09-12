

// 추상 클래스 : 이미 만들어진 클래스들에서 공통된 부분만 뽑아 만듦
public abstract class Snack {
	
	// 추상 메소드 -> 추상클래스가 아니라면 구현할 수 없다!
	public abstract void pick();
	
	// 추상 클래스는 일반 메소드도 만들 수 있다!
	public void test() {
		System.out.println("test");
	}
	
}
