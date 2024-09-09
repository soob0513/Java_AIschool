
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator(10, 30);
		
		System.out.println("sum : " + cal.sum());
		
		
		System.out.println("sub : " + cal.sub());
		System.out.println("mul : " + cal.mul());
		System.out.println("div : " + cal.div());
	}

}
