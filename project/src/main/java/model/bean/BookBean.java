package model.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class BookBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBook;

	private String ISBN;
	
	@ManyToOne
    @JoinColumn(name = "idAuthor")
	private AuthorBean author;
	
	@ManyToOne
    @JoinColumn(name = "idGenre")
	private GenreBean genre;
	private String title;
	private String publicationYear;
	
	public BookBean() {
		super();
	}

	public Integer getIdBook() {
		return idBook;
	}

	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}

	public AuthorBean getAuthor() {
		return author;
	}
	
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	
	public GenreBean getGenre() {
		return genre;
	}
	
	public void setGenre(GenreBean genre) {
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
}
