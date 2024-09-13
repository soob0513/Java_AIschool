package 인터페이스;

public class SolidKart implements KartRider {

	@Override
	public void go() {
		System.out.println("솔리드 전진");
	}

	@Override
	public void back() {
		System.out.println("솔리드 후진");
		
	}

	@Override
	public void booster() {
		// TODO Auto-generated method stub
		
	}

	
	
}
