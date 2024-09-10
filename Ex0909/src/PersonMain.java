
public class PersonMain {

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 25);
		Person person2 = new Person("김영희", 27);
		
		System.out.println("Person1의 이름 : " + person1.getName() + ", 나이 : " + person1.getAge());
		System.out.println("Person2의 이름 : " + person2.getName() + ", 나이 : " + person2.getAge());
		
		// 33명의 반 사람들의 객체를 생성하고 싶다면? 
		// --> 배열 사용!
		// --> 객체 배열 
		Person pArray[] = new Person[5];
		pArray[0] = person1;
		pArray[1] = person2;
		pArray[2] = new Person("임승환", 20);
		pArray[3] = new Person("신범식", 20);
		pArray[4] = new Person("김민수", 15);
	
		// 출력하기
		System.out.println(pArray[2].getName());
		
		// pArray를 이용해서 모든 사람의 이름과 나이를 출력
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].getName() + " " + pArray[i].getAge() + "세");
		}
		
	}

}
