
public class Student {
	// private : 나만 사용하겠습니다 (제일 좁은 접근 제한자)  
	// --> 현재 클래스에서만 사용하겠습니다!
	
	// default 접근제한자 : 같은 클래스, 같은 패키지, 상속 받은 클래스 x
	// protected 접근제한자 : 같은 클래스, 같은 패키지, 상속 받은 클래스 o
	
	private String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	public Student() {
		
	}
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	// show() --> 객체가 가지는 정보 출력 기능
	public void show() {
		// 같은 이름의 매개변수가 없다면
		// --> 클래스가 가지고 있는 필드를 의미한다!
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android 점수는 " + scoreAndroid + "점 입니다.");

		System.out.println("======================");
	}
	
}
