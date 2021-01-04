package Board.Article;

import java.util.ArrayList;

import Board.Util;

public class ArticleDao {
	
	ArrayList<Article> articles = new ArrayList<>();
	private int no = 5;
	Util util = new Util();
	
	public ArticleDao()
	{
		Article a1 = new Article(1, "title 1", "body 1", "anonymous", util.getCurrentDate(), 0, 0);
		Article a2 = new Article(2, "title 2", "body 2", "anonymous", util.getCurrentDate(), 0, 0);
		Article a3 = new Article(3, "title 3", "body 3", "anonymous", util.getCurrentDate(), 0, 0);
		Article a4 = new Article(4, "title 4", "body 4", "anonymous", util.getCurrentDate(), 0, 0);
		Article a5 = new Article(5, "title 5", "body 5", "anonymous", util.getCurrentDate(), 0, 0);
	
		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		articles.add(a4);
		articles.add(a5);
	}
	
	public void insertArticle(Article article)
	{
		no++;
		article.setId(no);
		
		article.setRegDate(util.getCurrentDate());
		article.setHit(0);
		article.setLikeCnt(0);
		
		System.out.println("article.getId : " + article.getId());
		System.out.println("before add : articles.size() : " + articles.size());
		
		articles.add(article);
		
		System.out.println("after add : articles.size() : " + articles.size());
		articles = getArticles();
		System.out.println("2 after add articles.size() : " + articles.size());
	}
	
	public ArrayList<Article> getArticles()
	{
		System.out.println("articles.size() : " + articles.size());
		return articles;
	}
	
	public Article getArticleById(int aid)
	{
		for(int i = 0; i < articles.size(); i++)
		{
			if(articles.get(i).getId() == aid)
			{
				return articles.get(i);
			}
		}
		
		return null;
	}
	
	public void deleteArticle(Article article)
	{
		articles.remove(article);
	}

}
