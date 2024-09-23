import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// MVC 디자인 패턴
	// - Model      --> MemberDTO
	// - View       --> MemberMain
	// - Controller --> MemberDAO
	
	// DAO : Data Access Object
	// DB 관련한 작업 모음
	
	// DB 연결 필요 객체 생성
	Connection conn = null;
	PreparedStatement psmt = null;
	
	// 연결부
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1522:xe";
			String dbUser = "hr";
			String dbPw = "hr";

			// conn 연결 정보 (Java와 DB 통로 정보)
			conn = DriverManager.getConnection(url, dbUser, dbPw);

		}catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 종료부
	public void close() {
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
	
	// 1. 회원가입
	public int join(String inputId, String inputPw, String inputNick) {
		conn();
		String sql = "insert into member values (?,?,?)";
		int row = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			psmt.setString(2, inputPw);
			
			psmt.setString(3, inputNick);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return row;
	}
	
	// 2. 로그인
	public int login(String inputId, String inputPw) {
		conn();
		
		String sql = "select * from member where ID = ? and PW = ?";
		int row = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			psmt.setString(2, inputPw);
			
			row = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return row;
	}
	
	// 2-1. 로그인 시 닉네임 가져와서 띄우기!
	public String loginNick(String id, String pw) {
		conn();
		String sql = "select nick from member where id = ? and pw = ?";
		
		String nick = "";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			ResultSet rs = psmt.executeQuery();
			
			rs.next();
			
			nick = rs.getString(1);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nick;
	}
	
	// 3. 정보수정
	public int update(String inputId, String inputNick) {
		conn();
		String sql = "update member set NICK = ? where ID = ?";
		int row = 0;
		
		try {
			// psmt : 통로 위에 올라가있는 Java 만들었던 쿼리문 정보
			psmt = conn.prepareStatement(sql);
			
			// 통로 위에 올라가있는 쿼리문에 데이터를 채워줌! 
			psmt.setString(1, inputNick);
			psmt.setString(2, inputId);

			// 쿼리문 실행!
			row = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			close();
		}
		
		return row;
	}
	
	// 4. 회원 목록
	public ArrayList<MemberDTO> getMemberList() {
		conn();
		String sql = "select * from member";

		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		try {
			psmt = conn.prepareStatement(sql);
			
			// 데이터 변경이 없을 때에는 executeQuery
			ResultSet rs = psmt.executeQuery();
			// rs.next();  --> 다음 행을 가리킴. 
			// 있다면 true, 없다면 false
			
			// 가져온 데이터 출력하기
//			if(rs.next()) {
//				String id = rs.getString(1);
//				String pw = rs.getString(2);
//				String nick = rs.getString(3);
//				System.out.println(id + " " + pw + " " + nick);
//			}
			
			// 모든 데이터 출력하기
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString("nick"); // 컬럼명 적어도 OK!
//				String nick = rs.getString(3);
				
//				System.out.println(id + " " + pw + " " + nick);
				
				memberList.add(new MemberDTO(id, pw, nick));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			close();
		}
		
		return memberList;
	}
}
