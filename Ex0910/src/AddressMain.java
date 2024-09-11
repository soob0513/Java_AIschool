import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Address 객체를 담을 수 있는 ArrayList 생성
		ArrayList<Address> addrList = new ArrayList<Address>();
		addrList.add(new Address("임승환", 20, "01011112222"));
		addrList.add(new Address("신범식", 20, "01033334444"));
		
		while(true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int menu = sc.nextInt();
			
			if (menu==1) {
				System.out.println("=====현재 등록되어있는 연락처=====");
				for(int i=0; i < addrList.size(); i++) {
					System.out.print(i+1 + ". ");
					System.out.print(addrList.get(i).getName());
					System.out.print( "(" + addrList.get(i).getAge() + "세) : ");
					System.out.println(addrList.get(i).getPhoneNumber());
				}
				
				// 추가
				System.out.print("몇 번에 추가할까요? >> ");
				int addIdx = sc.nextInt();
				System.out.print("이름 입력 >> ");
				String addName = sc.next();
				System.out.print("나이 입력 >> ");
				int addAge = sc.nextInt();
				System.out.print("전화번호 입력 >> ");
				String addPhone = sc.next();
				
				if(addIdx > addrList.size() || addIdx <= 0) {
					addrList.add(new Address(addName, addAge, addPhone));
				}else {
					addrList.add(addIdx-1, new Address(addName, addAge, addPhone));
				}
				
				
			}else if (menu==2) {
				// 전체조회
				if(addrList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					System.out.println("=====현재 등록되어있는 연락처=====");
					// for-each문 사용해보기
					int idx2 = 1;
					for(Address a : addrList) {
						System.out.print(idx2 + ". ");
						System.out.print(a.getName() + " ");
						System.out.print("(" + a.getAge() + "세) : ");
						System.out.println(a.getPhoneNumber());
						idx2++;
					}
				}	
			
			}else if(menu==3) {
				// 삭제
//				if (addrList.size() > 0) {
//					// 삭제 기능 진행
//				}else {
//					System.out.println("등록된 연락처가 없습니다.");
//				}
				
				if(addrList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					System.out.print("[1]삭제 [2]전체삭제 >> ");
					int deleteNum = sc.nextInt();
					if(deleteNum == 1) {
//						System.out.print("삭제하실 데이터를 선택해주세요. (0부터 " + (addrList.size()-1 < 0? 0 : addrList.size()-1) + "까지) >> ");
						System.out.println("=====현재 등록되어있는 연락처=====");
						for(int i=0; i < addrList.size(); i++) {
							System.out.print(i+1 + ". ");
							System.out.print(addrList.get(i).getName());
							System.out.print( "(" + addrList.get(i).getAge() + "세) : ");
							System.out.println(addrList.get(i).getPhoneNumber());
						}
						System.out.print("삭제하실 데이터를 선택해주세요. >> ");
						int removeNum = sc.nextInt();
						if((removeNum-1) >= addrList.size() || (removeNum-1) < 0) {
							System.out.println("해당하는 데이터가 없습니다. 다시 입력해주세요.");
						}else {
							addrList.remove(removeNum-1);
							System.out.println("삭제되었습니다.");
						}					
					}else if(deleteNum == 2) {
						System.out.println("정말로 전체 삭제 하시겠습니까? ");
						System.out.print("[1]네 [2]아니오 >> ");
						int clear = sc.nextInt();
						if(clear == 1) {
							addrList.clear();
							System.out.println("전체 삭제 되었습니다.");
						}
					}else {
						System.out.println("다시 입력해주세요.");
					}
				}
				
			}else if(menu==4) {
				// 검색
				System.out.print("검색할 이름 입력 : ");
				String searchName = sc.next();
				int number = 0;
				for(int i = 0; i < addrList.size(); i++) {
					
					// 숫자 데이터 비교 A==B
					// 문자 데이터 비교 "승환".equals("범식")
					if(addrList.get(i).getName().equals(searchName)) {
						System.out.print(i+1 + ". ");
						System.out.print(addrList.get(i).getName());
						System.out.print( "(" + addrList.get(i).getAge() + "세) : ");
						System.out.println(addrList.get(i).getPhoneNumber());
						number++;
					}
				}
				if(number == 0) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}
				
			}else if(menu==5) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("1~5까지만 입력해주세요.");
			}
		}
		
	}

}
