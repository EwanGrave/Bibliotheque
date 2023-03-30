package business;

import java.util.List;

import javax.inject.Inject;

import dao.AuthorDAO;
import dao.AuthorDAOImplJPA;
import model.bean.AuthorBean;

public class AuthorBusinessImpl implements AuthorBusiness{

	@Inject
	private AuthorDAO dao;
	
	AuthorBusinessImpl() {
	    this.dao = new AuthorDAOImplJPA();
	}

	
	@Override
	public List<AuthorBean> getAuthorList() {
		return this.dao.getAuthorList();
	}

	@Override
	public AuthorBean getAuthor(int id) {
		return this.dao.getAuthor(id);
	}

	@Override
	public AuthorBean getAuthor(String name) {
		return this.dao.getAuthor(name);
	}

	@Override
	public void insertAuthor(AuthorBean author) {
		this.dao.insertAuthor(author);
	}

}
