package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class MainDAO {
	
	private EntityManager em;

    public MainDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        this.em = emf.createEntityManager();
    }
    
    public EntityManager getEntityManager()
    {
    	return em;
    }

}
