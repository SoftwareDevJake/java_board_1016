package Board;

import java.util.ArrayList;
import java.util.Scanner;

import Board.Article.Article;
import Board.Article.ArticleDao;
import Board.Article.ArticleFunc;
import Board.Comment.CommentDao;
import Board.Member.Member;
import Board.Member.MemberDao;
import Board.Member.MemberFunc;

public class App {

	ArticleDao articleDao = new ArticleDao(); // 이게 
	CommentDao commentDao = new CommentDao();
	MemberDao memberDao = new MemberDao();
	
	ArticleFunc articleFunc = new ArticleFunc();
	MemberFunc memberFunc = new MemberFunc();
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		Member loginedMember = null;
		
		while(true)
		{	
			if(loginedMember == null)
			{
				System.out.print("Type command here : ");
			}
			else
			{
				System.out.print("Type command here [(" + loginedMember.getNickname()+ ")] : ");
			}
			
			
			String cmd = sc.nextLine();
			
			if(cmd.equals("article add"))
			{
				if(loginedMember == null)
				{
					System.out.println("This function is only for logined members");
				}
				else
				{					
					articleFunc.ArticleInsert();
				}
			}
			else if(cmd.equals("article list"))
			{
				list();
			}
			else if(cmd.equals("article update"))
			{
				if(loginedMember == null)
				{
					System.out.println("This function is only for logined members");
				}
				else
				{	
					articleFunc.ArticleUpdate();
				}
			}
			else if(cmd.equals("article delete"))
			{
				if(loginedMember == null)
				{
					System.out.println("This function is only for logined members");
				}
				else
				{	
					articleFunc.ArticleDelete();
				}
			}
			
			else if(cmd.equals("article read"))
			{
				if(loginedMember == null)
				{
					System.out.println("This function is only for logined members");
				}
				else
				{	
					articleFunc.ArticleRead();
				}
			}
			else if(cmd.equals("member sign up"))
			{
				memberFunc.signupMember();
			}
			else if(cmd.equals("member sign in"))
			{
				loginedMember = memberFunc.signinMember();
			}
			
		}
		
	}

	public void list()
	{
		ArrayList<Article> articles = articleDao.getArticles();
		
		for(int i = 0; i < articles.size(); i++)
		{
			System.out.println("====================");
			System.out.println("id : " + articles.get(i).getId());
			System.out.println("title : " + articles.get(i).getTitle());
			System.out.println("body : " + articles.get(i).getBody());
			System.out.println("writer : " + articles.get(i).getWriter());
			System.out.println("regDate : " + articles.get(i).getRegDate());
			System.out.println("hit : " + articles.get(i).getHit());
			System.out.println("likeCnt : " + articles.get(i).getLikeCnt());
		}
	}
	
}
