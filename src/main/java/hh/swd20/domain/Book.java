package hh.swd20.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title, author, isbn;
	private int year;
	private double price;
	
	  @ManyToOne
	    @JoinColumn(name = "catId")
	    private Category category;
	
	public Book() {}
	
	public Book(String author, String isbn, String title, int year, double price, Category category) {
		super();		
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		if (this.category != null)
			return "Book [id=" + id + ", author=" + author + ", isbn=" + isbn + ", title=" + title + ", year" + year + ", price " + price + ", category =" + this.getCategory() + "]";		
		else
			return "Book [id=" + id + ", author=" + author + ", isbn=" + isbn + ", title=" + title + ", year=" + year +", price=" + price +"]";
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category gategory) {
		this.category = gategory;
	}
	
	
}
