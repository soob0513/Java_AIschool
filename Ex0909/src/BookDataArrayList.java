import java.util.ArrayList;

public class BookDataArrayList {

	public static void main(String[] args) {
		
		// 모든 객체의 최상위 클래스 -> Object
//		ArrayList<Object> bArray = new ArrayList<Object>();
		ArrayList<BookData> bArray = new ArrayList<BookData>();

		bArray.add(new BookData("Java", 21000, "홍길동"));
		bArray.add(new BookData("C++", 29000, "박문수"));
		bArray.add(new BookData("Database", 31000, "김장독"));
		bArray.add(new BookData("Android", 18000, "이순신"));
		bArray.add(new BookData("Web", 26000, "김철수"));
		
		for(int i = 0; i < bArray.size(); i++) {
			// bArray.get(i) == bArray[i]
			System.out.print(bArray.get(i).getTitle() + " ");
			System.out.print(bArray.get(i).getPrice() + " ");
			System.out.print(bArray.get(i).getWriter() + " ");
			System.out.println();
		}
		
		
	}

}
