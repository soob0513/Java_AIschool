
public class Calculator {

	private int num1;
	private int num2;
	
	// 생성자 메소드
	public Calculator(int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int sum() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	public int mul() {
		return num1 * num2;
	}
	public double div() {
		return num1 / num2;
	}
	
}
