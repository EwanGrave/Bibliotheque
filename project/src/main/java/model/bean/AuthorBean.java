package model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Author")
public class AuthorBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAuthor;
	private String firstName;
	private String lastName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="author", orphanRemoval = true)
	private List<BookBean> books = new ArrayList<>();
	
	public AuthorBean() {
		super();
	}
	
	public int getId() {
		return idAuthor;
	}
	
	public void setId(int id) {
		this.idAuthor = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
