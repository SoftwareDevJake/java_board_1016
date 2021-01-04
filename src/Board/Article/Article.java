package Board.Article;

public class Article {
	private int id;
	private String title;
	private String body;
	private String writer;
	private Object regDate;
	private int hit;
	private int likeCnt;
	
	public Article()
	{
		
	}
	
	public Article(int id, String title, String body, String writer, Object regDate, int hit, int likeCnt) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.writer = writer;
		this.regDate = regDate;
		this.hit = hit;
		this.likeCnt = likeCnt;
	}

	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Object getRegDate() {
		return regDate;
	}
	public void setRegDate(Object regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	
}
