package Board.Member;

import java.util.ArrayList;

public class MemberDao {
	
	private int no = 0;
	ArrayList<Member> members = new ArrayList<>();
	
	public void insertMember(Member member)
	{
		member.setId(no);
		
		members.add(member);
	}
	
	public Member getMemberByMemberIdAndMemeberPw(String memberId, String memberPw)
	{
		for(int i = 0; i < members.size(); i++)
		{
			if(memberId.equals(members.get(i).getMemberId()) && memberPw.equals(members.get(i).getMemberPw()))
			{
				return members.get(i);
			}
		}
		
		return null;
	}

}
