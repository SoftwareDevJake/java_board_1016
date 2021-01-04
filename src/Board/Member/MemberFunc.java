package Board.Member;

import java.util.Scanner;

public class MemberFunc {
	
	Member member = new Member();
	MemberDao memberDao = new MemberDao();
	
	Scanner sc = new Scanner(System.in);
	Member loginedMember = new Member();
	
	public void signupMember()
	{
		System.out.print("Create your id : ");
		String memberId = sc.nextLine();
		
		System.out.print("Create your pw : ");
		String memberPw = sc.nextLine();
		
		System.out.print("Create your nickname : ");
		String nickname = sc.nextLine();
		
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setNickname(nickname);
		
		memberDao.insertMember(member);
	}

	public Member signinMember() {
		System.out.print("Type your id : ");
		String memberId = sc.nextLine();
		
		System.out.print("Type your pw : ");
		String memberPw = sc.nextLine();
		
		Member searchedMember = memberDao.getMemberByMemberIdAndMemeberPw(memberId, memberPw);
		
		if(searchedMember == null)
		{
			System.out.println("You got the wrong information!");
			return null;
		}
		else
		{
			System.out.println("Welcome " + searchedMember.getNickname() + "!");
			loginedMember = searchedMember;
			return searchedMember;
		}
	}
	
	public Member getSearchedMember()
	{
		return loginedMember;
	}
}
