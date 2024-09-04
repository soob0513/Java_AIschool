import java.util.Scanner;

public class Ex연산자 {

   public static void main(String[] args) {
      
      // 산술연산 +,-,*,/(몫),%(나머지)
      int num1 = 10;
      int num2 = 3;
      System.out.println(num1%num2);
      String num3 = "10";
      System.out.println(num1+num3);
      
      int data = 456;
      System.out.println(data/100+"00");
      System.out.println(10+"10");//-> 1010
      //// 
      // Java , Web , DB 점수를 입력받아
      // 총합과 평균 출력
      
      //사용자 입력 >> Scanner 
      Scanner sc = new Scanner(System.in);
      
      System.out.print("자바 점수 입력 >>");
      
      int JavaScore = sc.nextInt();
      System.out.print("웹 점수 입력 >>");
      int WebScore = sc.nextInt();
      System.out.print("디비 점수 입력 >>");
      int DbScore = sc.nextInt();
      
      System.out.println("총합 : "+(JavaScore+WebScore+DbScore));
      System.out.println("평균 : "+(JavaScore+WebScore+DbScore)/3);
   }
}
