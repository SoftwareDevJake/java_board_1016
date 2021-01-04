package Board.Member;

public class Member {
	
	private int id;
	private String memberId;
	private String memberPw;
	private String nickname;
	
	public Member()
	{
		
	}
	
	public Member(int id, String memberId, String memberPw, String nickname) {
		this.id = id;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.nickname = nickname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
