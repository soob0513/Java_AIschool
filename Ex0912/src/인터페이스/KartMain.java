package 인터페이스;

public class KartMain {

	public static void main(String[] args) {
		
		// 인터페이스로 객체 생성 불가
		// KartRider k = new KartRider();

		LuxuryKart kart1 = new LuxuryKart();
		kart1.go();
		
		SolidKart kart2 = new SolidKart();
		
		KartRider kart = kart1;
		kart.go();
		
	}

}
