package business;

import java.util.List;

import javax.inject.Inject;

import dao.GenreDAO;
import dao.GenreDAOImplJPA;
import model.bean.GenreBean;

public class GenreBusinessImpl implements GenreBusiness{

	@Inject
	private GenreDAO dao;
	public GenreBusinessImpl() {
	    this.dao = new GenreDAOImplJPA();
	}
	@Override
	public List<GenreBean> getGenreList() {
		return this.dao.getGenreList();
	}
	@Override
	public GenreBean getGenre(String name) {
		return this.dao.getGenre(name);
	}
	@Override
	public GenreBean getGenre(int id) {
		return this.dao.getGenre(id);
	}
	@Override
	public void insertGenre(GenreBean genre) {
	this.dao.insertGenre(genre);
	}
	
}
