import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		// ArrayList : 크기가 동적인 배열 (같은 타입만 다룰 수 있다!) 
		
		ArrayList<String> myTeam = new ArrayList<String>(); 
		// --> 배열의 시작 위치만 담겨있음!
		// 동적인 배열 : 추가, 삭제가 사용자 임의로 가능하다!
		
		// ArrayList 마지막 요소 추가 -> add(값)
		myTeam.add("승환");
		myTeam.add("범식");
		myTeam.add("민수");
		myTeam.add("경남");
		// 선택 추가
		myTeam.add(1, "수민");
		myTeam.add(0, "영표");
		
		// 데이터 삭제 -> remove(인덱스번호)
		myTeam.remove(2);
		
		// 데이터 전체 삭제 -> clear()
		myTeam.clear();
		
		
		// 데이터 출력(꺼내기) -> get(인덱스번호)
//		System.out.println(myTeam.get(0));
//		System.out.println(myTeam.get(1));
//		System.out.println(myTeam.get(2));
//		System.out.println(myTeam.get(3));

		
		// ArrayList 크기 -> size()
		for(int i=0; i < myTeam.size(); i++) {
			System.out.println(myTeam.get(i));
		}

		
	}

}
