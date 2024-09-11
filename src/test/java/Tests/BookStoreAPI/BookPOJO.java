package Tests.BookStoreAPI;

import java.util.Date;

public class BookPOJO {
	private String isbn;
	private String title;
	private String subTitle;
	private String author;
	private Date publishDate;
	private String publisher;
	private int pages;
	private String description;
	private String website;
	
	public BookPOJO(String isbn, String title, String subTitle,String author, Date publishDate, String publisher, int pages, String description, String website) {
		this.isbn = isbn;	
		this.title = title;
		this.subTitle = subTitle;
		this.author = author;
		this.publishDate = publishDate;
		this.publisher = publisher;
		this.pages = pages;
		this.description = description;
		this.website = website;

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}
