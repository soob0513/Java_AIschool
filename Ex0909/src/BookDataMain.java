import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BookData bArray[] = new BookData[5];
		
		bArray[0] = new BookData("Java", 21000, "홍길동");
		bArray[1] = new BookData("C++", 29000, "박문수");
		bArray[2] = new BookData("Database", 31000, "김장독");
		bArray[3] = new BookData("Android", 18000, "이순신");
		bArray[4] = new BookData("Web", 26000, "김철수");

		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("구매 가능한 책 목록");
		for(int i=0; i < bArray.length; i++) {
			if (money >= bArray[i].getPrice()) {
				System.out.println("[" + bArray[i].getTitle() + ", " + bArray[i].getWriter() + ", " + bArray[i].getPrice() + "원]");
			}
		}
		
		
		// 두번째 시도
		String title[] = {"Java", "C++", "Database", "Android", "Web"};
		int price[] = {21000, 29000, 31000, 18000, 26000};
		String writer[] = {"홍길동", "박문수", "김장독", "이순신", "김철수"};
		
		BookData bArray2[] = new BookData[title.length];
		
		for(int i = 0; i < bArray2.length; i++) {
			bArray2[i] = new BookData(title[i], price[i], writer[i]);
			
			System.out.println("2번째 >> " + bArray2[i].getTitle());
		}
		
		// 세번째 시도 - 책 정보 입력 받아서 넣기!
		BookData bArray3[] = new BookData[3];
		
		for(int i = 0; i < bArray3.length; i++) {
			System.out.print(i+1+"번째 책 제목 입력 >> ");
			String title2 = sc.next();
			System.out.print(i+1+"번째 책 가격 입력 >> ");
			int price2 = sc.nextInt();
			System.out.print(i+1+"번째 책 저자 입력 >> ");
			String writer2 = sc.next();
			
			bArray3[i] = new BookData(title2, price2, writer2);
		}
		
		for(int i = 0; i < bArray3.length; i++) {
			System.out.println("3번째 >> " + bArray3[i].getTitle() + " " + bArray3[i].getPrice() + "원");
		}
		
	}

}
