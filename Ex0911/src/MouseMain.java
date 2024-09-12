
public class MouseMain {

	public static void main(String[] args) {

		// 부모 객체
		Mouse m1 = new Mouse();
		m1.leftClick();
		m1.rightClick();
		m1.drag();
		
		System.out.println("===========");

		// 자식 객체 
		WheelMouse m2 = new WheelMouse();
		m2.leftClick();
		m2.rightClick();
		m2.scroll();
		
		System.out.println("===========");
		
		// 자식 객체 2
		HumanMouse m3 = new HumanMouse();
		m3.leftClick();
		m3.drag();
		m3.delStress();
	}

}
