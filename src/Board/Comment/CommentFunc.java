package Board.Comment;

import java.util.ArrayList;

public class CommentFunc {
	
	public void displayComments(ArrayList<Comment> comments, int aid) {
		for(int i = 0; i < comments.size(); i++)
		{
			if(comments.get(i).getArticleId() == aid)
			{
				System.out.println("=====comments=====");
				System.out.println("id : " + comments.get(i).getId());
				System.out.println("comment : " + comments.get(i).getComment());
				System.out.println("regDate : " + comments.get(i).getRegDate());
				System.out.println("writer : " + comments.get(i).getWriter());
			}
		}
	}
	
}
