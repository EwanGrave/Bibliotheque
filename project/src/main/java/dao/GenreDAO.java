package dao;

import java.util.List;

import model.bean.GenreBean;

public interface GenreDAO {
	public List<GenreBean> getGenreList();
	public GenreBean getGenre (String name);
	public GenreBean getGenre (int id);
	public void insertGenre (GenreBean genre);
}
