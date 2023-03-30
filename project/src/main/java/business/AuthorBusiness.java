package business;

import java.util.List;

import model.bean.AuthorBean;

public interface AuthorBusiness {
	public List<AuthorBean> getAuthorList();
	public AuthorBean getAuthor(int id);
	public AuthorBean getAuthor(String name);
	public void insertAuthor (AuthorBean book);
}
