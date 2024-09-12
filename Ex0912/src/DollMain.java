
public class DollMain {

	public static void main(String[] args) {

		// 포켓몬 인형뽑기
		// 피카츄 인형을 뽑고 싶어요!
		Pika d1 = new Pika();
		machineControl(d1);

		// 잠만보 인형을 뽑고 싶어요!
		Zam d2 = new Zam();
		machineControl(d2);
		
		// 치코리타 인형을 뽑고 싶어요!
		Chico d3 = new Chico();
		machineControl(d3);
		
	}
	
	public static void machineControl(Doll d) {
		d.pick();
	}
	
	// 인형뽑기 기능 
	// 피카츄 인형을 뽑기 기능
//	public static void machineControl(Pika d1) {
//		d1.pick();
//	}

}
