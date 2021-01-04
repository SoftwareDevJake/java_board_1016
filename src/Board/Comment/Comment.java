package Board.Comment;

public class Comment {
	
	private int id;
	private int articleId;
	private String comment;
	private Object regDate;
	private String writer;
	
	public Comment()
	{
		
	}
	
	public Comment(int id, int articleId, String comment, Object regDate, String writer) {
		this.id = id;
		this.articleId = articleId;
		this.comment = comment;
		this.regDate = regDate;
		this.writer = writer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Object getRegDate() {
		return regDate;
	}
	public void setRegDate(Object regDate) {
		this.regDate = regDate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
