package dao;

import java.util.List;

import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

public interface BookDAO {
	public List<BookBean> getBookList();
	public BookBean getBook(String titre);
	public BookBean getBook(AuthorBean author);
	public BookBean getBook(GenreBean genre);
	public void insertBook (BookBean book);
	
	public List<BookBean> getBookListByFilter(String title, String author, String genre, boolean availible);
}
