package pub.vo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	private String ISBN;
	private String title;
	private String author;
	private int page;
	private int price;
	private Date publishDate;
	private int publisherNo;
	private Publisher publisher;
	
	public Book(){}

	public Book(String iSBN, String title, String author, int page, int price,
			Date publishDate, int publisherNo) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
		this.publishDate = publishDate;
		this.publisherNo = publisherNo;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + page;
		result = prime * result + price;
		result = prime * result
				+ ((publishDate == null) ? 0 : publishDate.hashCode());
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
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
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
		if (publisherNo != other.publisherNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "도서정보 [ISBN : " + ISBN + ", 도서제목 : " + title + ", 저자 : " + author
				+ ", 쪽수 : " + page + ", 가격 : " + price + ", 출판일 : "
				+ publishDate + ", 출판사 번호 : " + publisherNo +"]";
	}
}
