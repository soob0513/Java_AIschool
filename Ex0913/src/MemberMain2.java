import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain2 {

	public static void main(String[] args) {

		// 회원관리 프로그램
		// 1. 회원가입
		// 2. 로그인
		// 3. 회원 정보 수정
		// 4. 회원 목록 출력
		// 5. 종료

		Scanner sc = new Scanner(System.in);

		MemberDAO dao = new MemberDAO();

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

				int row = dao.join(id, pw, nick);

				if (row > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}
				
			} else if (menu == 2) {
				// 로그인
				// 1. 로그인할 ID, PW를 사용자로부터 입력받기
				// 2. 입력받은 ID, PW를 지니고 있는 회원이 있다면, 
				//    --> 로그인 성공! --> Main 클래스에서 출력!
				// 3. ID, PW를 가지고 있는 회원이 없다면, 
				//    --> 로그인 실패! --> Main 클래스에서 출력!
				
				System.out.print("ID입력 >> ");
				String id = sc.next();
				System.out.print("PW입력 >> ");
				String pw = sc.next();
				
				int row = dao.login(id, pw);
				String nick = dao.loginNick(id, pw);
				
				if(row > 0) {
					System.out.println(nick + "님 환영합니다.");
				}else {
					System.out.println("해당하는 로그인 정보가 없습니다.");
				}
				
			} else if (menu == 3) {
				// 정보수정
				
				System.out.print("ID입력 >> ");
				String inputId = sc.next();
				
				System.out.print("수정할 NICK 입력 >> ");
				String inputNick = sc.next();

				int row = dao.update(inputId, inputNick);

				// 쿼리문이 제대로 실행됐는지 확인
				if (row > 0) {
					System.out.println("닉네임 변경 성공");
				} else {
					System.out.println("닉네임 변경 실패");
				}
				
			} else if (menu == 4) {
				// 회원 목록 출력
				ArrayList<MemberDTO> memberList = dao.getMemberList();
				
				for(int i=0; i<memberList.size(); i++) {
					System.out.print("ID : "+ memberList.get(i).getId());
					System.out.print(" | PW : "+ memberList.get(i).getPw());
					System.out.println(" | NICK : "+ memberList.get(i).getNick());
				}
				
			} else if (menu == 5) {
				// 종료
				break;
			}
		}
	}

}
