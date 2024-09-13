package 인터페이스;

public class LuxuryKart implements KartRider {

	// implements : 인터페이스 상속 키워드    
	// 인터페이스는 다중 상속이 가능하다! 
	
	@Override
	public void go() {
		System.out.println("선장님 출발");
		
	}

	@Override
	public void back() {
		System.out.println("선장님 후진");
		
	}

	@Override
	public void booster() {
		System.out.println("선장님 부스터~~~");
		
	}

}
