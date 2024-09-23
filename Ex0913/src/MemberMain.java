import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

		// DB 연결 필요 객체 생성
		Connection conn = null;
		PreparedStatement psmt = null;

		while (true) {
			System.out.print("1.회원가입 2.로그인 3.정보수정 4.회원목록출력 5.종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 회원가입
				System.out.print("ID입력 >> ");
				String id = sc.next();
				System.out.print("PW입력 >> ");
				String pw = sc.next();
				System.out.print("NICK입력 >> ");
				String nick = sc.next();

				// 데이터베이스 연결 (ojdbc6.jar 불러오기)
				try {

					/////////////////////// 연결부////////////////////////
					// 1. OracleDriver 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Connection 객체 생성 (DB 연결하는 객체)
//					Connection conn; 

					// 12505 에러가 나면
					// 1. C:\oraclexe\app\oracle\product\11.2.0\server\network\ADMIN >> 확인
					// 2. 포트 번호 1521 -> 1522로 수정!
					String url = "jdbc:oracle:thin:@localhost:1522:xe";
					String dbUser = "hr";
					String dbPw = "hr";

					// 정보 담아서 통로 만들기
					conn = DriverManager.getConnection(url, dbUser, dbPw);

					System.out.println("DB 접속 성공");
					/////////////////////// 연결부 끝////////////////////////

					/////////////////////// 실행부////////////////////////
					// 3. SQL문 작성 및 실행
					String sql = "insert into member values (?,?,?)";

					// 4. 자바에서의 쿼리문을 sql 실행 가능한 쿼리문으로 변환
					// ---> 자바의 문자열을 Oracle 쿼리로 변경
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id); // 1부터 시작함
					psmt.setString(2, pw);
					psmt.setString(3, nick);

					// 5. 쿼리문 실행 --> ctrl + Enter 역할
					// executeUpdate --> 쿼리문을 통해 변경된 행의 개수를 반환
					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("회원가입 성공!");
					} else {
						System.out.println("회원가입 실패!");
					}
					/////////////////////// 실행부 끝////////////////////////

				} catch (ClassNotFoundException e) {
					System.out.println("드라이버 파일");
					e.printStackTrace();
					System.out.println("드라이버 파일 찾기 실패");

				} catch (SQLException e) {
					System.out.println("sql오류");
					e.printStackTrace();
					System.out.println("DB 연결 실패");
				}
				/////////////////////// 종료부////////////////////////
				// 연결 정보 삭제(통로 닫아주기)
				// 역순
				finally {

					// 6. 자원반납
					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}

				}
				/////////////////////// 종료부 끝////////////////////////
			} else if (menu == 2) {
				// 로그인
				System.out.print("ID입력 >> ");
				String id = sc.next();
				System.out.print("PW입력 >> ");
				String pw = sc.next();

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					String url = "jdbc:oracle:thin:@localhost:1522:xe";
					String dbUser = "hr";
					String dbPw = "hr";

					// 정보 담아서 통로 만들기
					try {
						conn = DriverManager.getConnection(url, dbUser, dbPw);

						String sql = "select * from member where ID = ? and PW = ?";
						
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, id);
						psmt.setString(2, pw);
						
						int row = psmt.executeUpdate();
						
						if(row > 0) {
							System.out.println(id + "님 환영합니다.");
						}else {
							System.out.println("해당하는 로그인 정보가 없습니다.");
						}

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (menu == 3) {
				// 정보수정
				// 1. 수정하고 싶은 회원의 ID 입력 받기
				System.out.print("ID입력 >> ");
				String inputId = sc.next();
				
				// 2. 어떤 NICK으로 바꿀건지 new Nick 입력받기
				System.out.print("수정할 NICK 입력 >> ");
				String inputNick = sc.next();

				// 연결부
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					String url = "jdbc:oracle:thin:@localhost:1522:xe";
					String dbUser = "hr";
					String dbPw = "hr";

					// conn 연결 정보 (Java와 DB 통로 정보)
					conn = DriverManager.getConnection(url, dbUser, dbPw);

					// 실행부
					// 3. 입력한 ID를 가진 회원의 NICK 수정하기
					String sql = "update member set NICK = ? where ID = ?";

					// psmt : 통로 위에 올라가있는 Java 만들었던 쿼리문 정보
					psmt = conn.prepareStatement(sql);
					
					// 통로 위에 올라가있는 쿼리문에 데이터를 채워줌! 
					psmt.setString(1, inputNick);
					psmt.setString(2, inputId);

					// 쿼리문 실행!
					int row = psmt.executeUpdate();

					// executeUpdate() --> 쿼리문을 통해 변경된 행의 개수를 반환 
					// 쿼리문이 제대로 실행됐는지 확인
					if (row > 0) {
						System.out.println("닉네임 변경 성공");
					} else {
						System.out.println("닉네임 변경 실패");
					}

				}catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {

					try {
						if (psmt != null)
							psmt.close();

						if (conn != null)
							conn.close();

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else if (menu == 4) {
				// 회원 목록 출력
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					String url = "jdbc:oracle:thin:@localhost:1522:xe";
					String dbUser = "hr";
					String dbPw = "hr";

					conn = DriverManager.getConnection(url, dbUser, dbPw);

					String sql = "select * from member";
					psmt = conn.prepareStatement(sql);

					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println(row);
					} else {
						System.out.println("회원목록출력 실패");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					try {
						if (psmt != null)
							psmt.close();

						if (conn != null)
							conn.close();

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else if (menu == 5) {
				// 종료
				break;
			}
		}
	}

}
