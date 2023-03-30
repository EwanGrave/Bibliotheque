package business;

import java.util.List;

import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

public interface GenreBusiness {
	public List<GenreBean> getGenreList();
	public GenreBean getGenre (String name);
	public GenreBean getGenre (int id);
	public void insertGenre (GenreBean genre);
}
