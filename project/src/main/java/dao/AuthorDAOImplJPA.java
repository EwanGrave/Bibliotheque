package dao;

import java.util.List;

import javax.persistence.*;

import model.bean.AuthorBean;

public class AuthorDAOImplJPA implements AuthorDAO{
private EntityManager em;

public AuthorDAOImplJPA() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
    this.em = emf.createEntityManager();
}

@Override
public List<AuthorBean> getAuthorList() {
    Query requete = em.createQuery("select n from AuthorBean n");
    return requete.getResultList();
}

@Override
public AuthorBean getAuthor(int id) {
	return em.find(AuthorBean.class, id);
}

@Override
public AuthorBean getAuthor(String name) {
	return em.find(AuthorBean.class, name);
}

@Override
public void insertAuthor(AuthorBean book) {
    em.getTransaction().begin();
    em.persist(book);
    em.getTransaction().commit();		
}

}
