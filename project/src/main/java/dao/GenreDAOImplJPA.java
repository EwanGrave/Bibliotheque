package dao;

import java.util.List;

import javax.persistence.*;

import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

public class GenreDAOImplJPA implements GenreDAO{
private EntityManager em;

public GenreDAOImplJPA() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
    this.em = emf.createEntityManager();
}

@Override
public List<GenreBean> getGenreList() {
    Query requete = em.createQuery("select n from GenreBean n");
    return requete.getResultList();
}

@Override
public GenreBean getGenre(String name) {
	return em.find(GenreBean.class, name);
}

@Override
public GenreBean getGenre(int id) {
	return em.find(GenreBean.class, id);
}

@Override
public void insertGenre(GenreBean genre) {
    em.getTransaction().begin();
    em.persist(genre);
    em.getTransaction().commit();	
}

}
