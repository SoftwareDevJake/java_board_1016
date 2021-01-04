package Board.Comment;

import java.util.ArrayList;

import Board.Util;

public class CommentDao {
	
	private int no = 0;
	Util util = new Util();
	ArrayList<Comment> comments = new ArrayList<>();
	
	public void insertComment(Comment comment, int aid)
	{
		no++;
		comment.setId(no);
		comment.setArticleId(aid);
		comment.setRegDate(util.getCurrentDate());
		comment.setWriter("anonymous");
		
		comments.add(comment);
	}
	
	public ArrayList<Comment> getCommentByAid(int aid)
	{
		comments = getComments();
		ArrayList<Comment> searchedComments = new ArrayList<>();
				
		for(int i = 0; i < comments.size(); i++)
		{
			Comment comment = comments.get(i);
			if(aid == comments.get(i).getArticleId())
			{
				searchedComments.add(comment);
				return comments;
			}
		}
		return null;
	}
	
	public ArrayList<Comment> getComments()
	{
		return comments;
	}
}
