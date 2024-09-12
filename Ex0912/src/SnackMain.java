
public class SnackMain {

	public static void main(String[] args) {
		
		SunChip s1 = new SunChip();
		eat(s1);
		
		Honey s2 = new Honey();
		eat(s2);
		
		YacheTime s3 = new YacheTime();
		eat(s3);
		
		 
		
	}
	
	// 기능
	public static void eat(Snack s) {
		s.pick();
		
		// 야채타임 과자를 먹을 경우
		// 케첩을 찍어 먹고 싶어요!
		// s.ketchup();  --> 불가능
		
		// 다운캐스팅을 진행! --> 업캐스팅된 객체를 다시 자식 객체로 변환
		// instanceof --> 업캐스팅 이전의 타입을 확인하는 연산
		if(s instanceof YacheTime) {
			// 다운 캐스팅 --> 하위 클래스에 상위 클래스를 넣어주겠습니다
			YacheTime yache = (YacheTime)s;
			yache.ketchup();
			
		}
		
	}

}
