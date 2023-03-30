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
@Table(name="Genre")
public class GenreBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGenre;
	private String name;
	
	@OneToMany(targetEntity=BookBean.class, mappedBy="genre")
	private List<BookBean> books = new ArrayList<>();
	
	public GenreBean() {
		super();
	}

	public Integer getId() {
		return idGenre;
	}

	public void setId(Integer id) {
		this.idGenre = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
