package bookstore.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Serializable{
	private String isbn;
	private String title;
	private String author;
	private int page;
	private int price;
	private Date publishDate;
	private int publisherNo;
	
	private Publisher publisher;

	public Book(String isbn, String title, String author, int page, int price,
			Date publishDate, int publisherNo, Publisher publisher) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
		this.publishDate = publishDate;
		this.publisherNo = publisherNo;
		this.publisher = publisher;
	}

	public Book(String isbn, String title, String author, int page, int price,
			Date publishDate, int publisherNo) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
		this.publishDate = publishDate;
		this.publisherNo = publisherNo;
	}
	public Book(){}
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPublisherNo() {
		return publisherNo;
	}

	public void setPublisherNo(int publisherNo) {
		this.publisherNo = publisherNo;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = null;
		if(publishDate!=null){
			date = sdf.format(publishDate);
		}
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", page=" + page + ", price=" + price + ", publishDate="
				+ date + ", publisherNo=" + publisherNo + ", publisher="
				+ publisher + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + page;
		result = prime * result + price;
		result = prime * result
				+ ((publishDate == null) ? 0 : publishDate.hashCode());
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + publisherNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		if (publishDate == null) {
			if (other.publishDate != null)
				return false;
		} else if (!publishDate.equals(other.publishDate))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (publisherNo != other.publisherNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
