import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		// 회원관리 프로그램
		// 1. 회원가입
		// 2. 로그인 
		// 3. 회원 정보 수정
		// 4. 회원 목록 출력
		// 5. 종료
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1.회원가입 2.로그인 3.정보수정 4.회원목록출력 5.종료 >> ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				// 회원가입
				System.out.print("ID입력 >> ");
				String id = sc.next();
				System.out.print("PW입력 >> ");
				String pw = sc.next();
				System.out.print("NICK입력 >> ");
				String nick = sc.next();
				

				// 데이터베이스 연결 (ojdbc6.jar 불러오기)
				try {
					// 1. OracleDriver 로딩 
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					// 2. Connection 객체 생성 (DB 연결하는 객체)
					Connection conn; 
					
					// 12505 에러가 나면 
					// 1. C:\oraclexe\app\oracle\product\11.2.0\server\network\ADMIN >> 확인
					// 2. 포트 번호 1521 -> 1522로 수정! 
					String url = "jdbc:oracle:thin:@localhost:1522:xe";
					String dbUser = "hr";
					String dbPw = "hr";
					
					// 정보 담아서 통로 만들기
					conn = DriverManager.getConnection(url, dbUser, dbPw);
					
					System.out.println("DB 접속 성공");
					
					
					
				} catch (ClassNotFoundException e) {
					System.out.println("드라이버 파일");
					e.printStackTrace();
					System.out.println("드라이버 파일 찾기 실패");
					
				} catch (SQLException e) {
					System.out.println("sql오류");
					e.printStackTrace();
					System.out.println("DB 연결 실패");
				}
				
			}
			else if(menu==2){
				// 로그인
			}
			else if(menu==3) {
				// 정보수정
			}
			else if (menu==4) {
				// 회원 목록 출력
			}
			else if (menu==5) {
				// 종료
				break;
			}
		}
	}

}
