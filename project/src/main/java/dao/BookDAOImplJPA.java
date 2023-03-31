package dao;

import java.util.List;

import javax.persistence.*;

import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

public class BookDAOImplJPA extends MainDAO implements BookDAO{
	
	@Override
	public List<BookBean> getBookList() {
	    Query requete = this.getEntityManager().createQuery("select n from BookBean n order by title asc");
	    return requete.getResultList();
	}
	
	@Override
	public BookBean getBook(String titre) {
	    BookBean book = (BookBean) this.getEntityManager().find(BookBean.class, titre);
	    return book;
	}
	
	@Override
	public BookBean getBook(AuthorBean author) {
		BookBean book = (BookBean) this.getEntityManager().find(BookBean.class, author);
		return book;
	}
	
	@Override
	public BookBean getBook(GenreBean genre) {
		BookBean book = (BookBean) this.getEntityManager().find(BookBean.class, genre);
		return book;
	}
	
	@Override
	public void insertBook(BookBean book) {
		this.getEntityManager().getTransaction().begin();
	    this.getEntityManager().persist(book);
	    this.getEntityManager().getTransaction().commit();
	}
	
	@Override
	public List<BookBean> getBookListByFilter(String title, String author, String genre, boolean availible) {
		String sql = "select * from book b inner join author a on (b.idAuthor = a.idAuthor) "
					+ "					   left join loan l on (b.idbook = l.idbook) "
					+ "					   inner join genre g on (b.idgenre = g.idgenre) "
					+ "where lower(title) like lower('%"+ title +"%') "
					+ "and lower(concat(firstname, ' ', lastname)) like lower('%"+ author +"%') ";
		
		if (!genre.equals(""))
			sql += "and g.idGenre = " + genre;
		
		Query requete = this.getEntityManager().createNativeQuery(sql, BookBean.class);
		
		return requete.getResultList();
	}
}
