package dao;

import java.util.List;

import javax.persistence.*;

import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

public class BookDAOImplJPA implements BookDAO{
private EntityManager em;

public BookDAOImplJPA() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
    this.em = emf.createEntityManager();
}

@Override
public List<BookBean> getBookList() {
    Query requete = em.createQuery("select n from BookBean n order by title asc");
    return requete.getResultList();
}

@Override
public BookBean getBook(String titre) {
    BookBean book = (BookBean) em.find(BookBean.class, titre);
    return book;
}

@Override
public BookBean getBook(AuthorBean author) {
	BookBean book = (BookBean) em.find(BookBean.class, author);
	return book;
}

@Override
public BookBean getBook(GenreBean genre) {
	BookBean book = (BookBean) em.find(BookBean.class, genre);
	return book;
}

@Override
public void insertBook(BookBean book) {
    em.getTransaction().begin();
    em.persist(book);
    em.getTransaction().commit();
}
}
