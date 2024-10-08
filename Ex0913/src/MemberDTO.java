
public class MemberDTO {
	// DTO : Data Transfer Object
	// VO 클래스 : Value Object (get만 존재)
	
	private String id;
	private String pw;
	private String nick;
	
	public MemberDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
}
