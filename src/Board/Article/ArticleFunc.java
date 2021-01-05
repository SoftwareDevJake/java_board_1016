package Board.Article;

import java.util.ArrayList;
import java.util.Scanner;

import Board.Comment.Comment;
import Board.Comment.CommentDao;
import Board.Comment.CommentFunc;
import Board.Member.Member;
import Board.Member.MemberFunc;

public class ArticleFunc {
	
	ArticleDao articleDao = new ArticleDao(); // 이부분이 문제일 가능성 높음
	CommentDao commentDao = new CommentDao();
	
	
	CommentFunc commentFunc = new CommentFunc();
	MemberFunc memberFunc = new MemberFunc();
	Scanner sc = new Scanner(System.in);
	
	public void displayArticle(int aid)
	{
		Article article = new Article();
		
		article = articleDao.getArticleById(aid);
		
		System.out.println("====================");
		System.out.println("id : " + article.getId());
		System.out.println("title : " + article.getTitle());
		System.out.println("body : " + article.getBody());
		System.out.println("writer : " + article.getWriter());
		System.out.println("regDate : " + article.getRegDate());
		System.out.println("hit : " + article.getHit());
		System.out.println("likeCnt : " + article.getLikeCnt());
	}
	
	public void ArticleInsert() {
		Article article = new Article();
		Member searchedMember = memberFunc.getSearchedMember();
		
		System.out.print("Type title : ");
		String title = sc.nextLine();
		
		System.out.print("Type body : ");
		String body = sc.nextLine();
		
		article.setTitle(title);
		article.setBody(body);
		article.setWriter(searchedMember.getNickname());
		
		
		articleDao.insertArticle(article);
		
		System.out.println("Article has been added!");
		
	}
	
	public void ArticleDelete() {
		Article article = new Article();
		System.out.print("Type an id of the Articles to delete : ");
		int aid = Integer.parseInt(sc.nextLine());
		
		article = articleDao.getArticleById(aid);
		
		articleDao.deleteArticle(article);
	}

	public void ArticleUpdate() {
		Article article = new Article();
		System.out.print("Type an id of the Articles to update : ");
		int aid = Integer.parseInt(sc.nextLine());
		
		article = articleDao.getArticleById(aid);
		
		if(article == null)
		{
			System.out.println("Article you chosen doens't exit");
		}
		else
		{
			System.out.print("Type new title : ");
			String title = sc.nextLine();
			
			System.out.print("Type new body : ");
			String body = sc.nextLine();
			
			article.setTitle(title);
			article.setBody(body);
		}
	}
	
	public void ArticleRead() {
		System.out.print("Type an id of the Articles to read : ");
		int aid = Integer.parseInt(sc.nextLine());
		
		Article article = articleDao.getArticleById(aid);
		
		ArrayList<Comment> searchedComments = commentDao.getCommentByAid(aid);
		
		displayArticle(aid);
		commentFunc.displayComments(searchedComments, aid);
		
		while(true)
		{
			Comment comment = new Comment();
			
			System.out.println("Type a function in this article");
			System.out.print("1. comment, 2. like, 3. update, 4. delete, 5. go back to list : ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1)
			{
				System.out.print("Type comment : ");
				String cmt = sc.nextLine();
				
				comment.setComment(cmt);
				
				commentDao.insertComment(comment,aid);
				
				System.out.println("Completed adding a comment!");
				System.out.println();
				
				displayArticle(aid);
				commentFunc.displayComments(searchedComments, aid);
				
			}
			else if(choice == 2)
			{
				System.out.println("Like the article");
			}
			else if(choice == 3)
			{
				System.out.println("Update the article");
			}
			else if(choice == 4)
			{
				System.out.println("Delete the article");
			}
			else if(choice == 5)
			{
				break;
			}
		}
	}
}
