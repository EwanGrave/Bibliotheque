package dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import model.bean.BookBean;
import model.bean.LoanBean;
import model.bean.UserBean;

public class LoanDAOImplJPA implements LoanDAO{
private EntityManager em;

public LoanDAOImplJPA() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
    this.em = emf.createEntityManager();
}

@Override
public List<LoanBean> getLoanList() {
	Query requete = em.createQuery("select n from LoanBean n");
    return requete.getResultList();
}

@Override
public LoanBean getLoan(UserBean user) {
	return em.find(LoanBean.class, user);
}

@Override
public LoanBean getLoan(BookBean book) {
	return em.find(LoanBean.class, book);
}

@Override
public LoanBean getLoan(Date date) {
	return em.find(LoanBean.class, date);
}

@Override
public void insertLoan(LoanBean loan) {
    em.getTransaction().begin();
    em.persist(loan);
    em.getTransaction().commit();	
}

}
