package business;

import dao.UserDAO;
import model.bean.UserBean;

public class UserBusiness {
	
	private UserDAO dao;
	
	public UserBusiness()
	{
		dao = new UserDAO();
	}
	
	public UserBean getUser(String username)
	{
		return dao.getUser(username);
	}

	public void insertUser(UserBean user) {
		dao.insertUser(user);
	}
	
	public boolean userExists(UserBean user)
	{
		return dao.userExists(user);
	}
}
