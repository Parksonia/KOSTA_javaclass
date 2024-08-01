package dto;

import javax.management.loading.PrivateClassLoader;

public class Article {
	private Integer num;
	private String title;
	private String content;
	private String writer;
	
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Article(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public Article(Integer num, String title, String content, String writer) {
	
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public Article() {}
	@Override
	public String toString() {
		return "Article [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
