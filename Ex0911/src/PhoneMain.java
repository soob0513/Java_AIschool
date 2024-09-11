
public class PhoneMain {

	public static void main(String[] args) {
	
		// 부모 객체
		Tel p1 = new Tel();
		p1.call();
		p1.button();
		
		System.out.println("===========");
		Folder p2 = new Folder();
		p2.call();
		p2.button();
		p2.open();
		
		System.out.println("===========");
		Smart p3 = new Smart();
		p3.button();
	}

}
