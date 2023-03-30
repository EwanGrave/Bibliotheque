package dao;

import java.util.List;

import model.bean.AuthorBean;

public interface AuthorDAO {
	public List<AuthorBean> getAuthorList();
	public AuthorBean getAuthor(int id);
	public AuthorBean getAuthor(String name);
	public void insertAuthor (AuthorBean book);
}
