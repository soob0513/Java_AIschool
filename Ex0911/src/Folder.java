
// 자식 클래스
public class Folder extends Tel {
	// extends : 부모 클래스를 상속 받겠습니다.
	//           --> 부모 클래스로부터 확장 시키겠습니다.
	
	// call, callSend, button
	// --> 폴더폰은 다이얼을 돌리지 않는다 (부모와 세부 내용이 다른 기능)
	// --> 메소드 이름은 같게하고, 내용만 다르게 정의! 
	// --> 재정의!! -> 메소드 오버라이딩(상속 개념이 포함) -> 다형성
	// 자식 클래스에서 오버라이딩 했다면 
	// 부모 클래스에서 물려준 기능이 아닌 오버라이딩한 기능을 사용한다!
	public void button() {
		System.out.println("다이얼을 클릭해서 버튼을 누른다");
	}
	
	// 자식에서 만든 기능은 부모에서 사용할 수 없다!
	public void open() {
		System.out.println("폴더폰을 연다");
	}
	
}
