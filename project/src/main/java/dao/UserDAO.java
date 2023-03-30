package dao;

import java.util.List;

import model.MD5;
import model.bean.UserBean;

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
}
