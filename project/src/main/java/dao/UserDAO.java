package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import model.MD5;
import model.bean.LoanBean;
import model.bean.UserBean;
import dao.LoanDAOImplJPA;
public class UserDAO extends MainDAO {
	
	public UserBean getUser(String username)
	{
		UserBean user = this.getEntityManager().find(UserBean.class, username);
	    return user;
	}
	
	public boolean userExists(UserBean user)
	{
		List<UserBean> users = this.getEntityManager()
							.createNativeQuery("select * from userbean where username = ? and password = ?", UserBean.class)
							.setParameter(1, user.getUsername())
							.setParameter(2, MD5.getMd5(user.getPassword()))
							.getResultList();
		
		return users.size() > 0;
	}

	public void insertUser(UserBean user) {
		this.getEntityManager().getTransaction().begin();
		this.getEntityManager().persist(user);
		this.getEntityManager().getTransaction().commit();
	}
	
	public ArrayList<LoanBean> getUserLoansList(UserBean user){
		LoanDAOImplJPA loanDAOImplJPA = new LoanDAOImplJPA();
		ArrayList<LoanBean> loanList = new ArrayList<LoanBean>();
		for(LoanBean loan : loanDAOImplJPA.getLoanList()) {
			if (loan.getUser() != user) {
				loanList.add(loan);
			}
		}
		return loanList;
	}
}
