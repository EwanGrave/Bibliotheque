package dao;

import java.sql.Date;
import java.util.List;

import model.bean.BookBean;
import model.bean.LoanBean;
import model.bean.UserBean;

public interface LoanDAO {
	public List<LoanBean> getLoanList();
	public LoanBean getLoan (UserBean user);
	public LoanBean getLoan (BookBean book);
	public LoanBean getLoan (Date date);
	public void insertLoan (LoanBean genre);
}
