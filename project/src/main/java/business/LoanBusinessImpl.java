package business;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import dao.LoanDAO;
import dao.LoanDAOImplJPA;
import model.bean.BookBean;
import model.bean.LoanBean;
import model.bean.UserBean;

public class LoanBusinessImpl implements LoanBusiness{

	@Inject
	private LoanDAO dao;
	public LoanBusinessImpl() {
	    this.dao = new LoanDAOImplJPA();
	}
	@Override
	public List<LoanBean> getLoanList() {
		return this.dao.getLoanList();
	}
	@Override
	public LoanBean getLoan(UserBean user) {
		return this.dao.getLoan(user);
	}
	@Override
	public LoanBean getLoan(BookBean book) {
		return this.dao.getLoan(book);
	}
	@Override
	public LoanBean getLoan(Date date) {
		return this.dao.getLoan(date);
	}
	@Override
	public void insertLoan(LoanBean loan) {
		this.dao.insertLoan(loan);
	}

}
