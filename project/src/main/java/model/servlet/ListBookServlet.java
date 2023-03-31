package model.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.BookBusiness;
import business.BookBusinessImpl;
import business.GenreBusiness;
import business.GenreBusinessImpl;
import model.bean.AuthorBean;
import model.bean.BookBean;
import model.bean.GenreBean;

@WebServlet(name="ListBookServlet", urlPatterns= {"/", "/books"})
public class ListBookServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private BookBusiness bookBusiness;
	private GenreBusiness genreBusiness;

	@Override
	public void init() throws ServletException {
	    this.bookBusiness = new BookBusinessImpl();
	    this.genreBusiness = new GenreBusinessImpl();
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<BookBean> books = this.bookBusiness.getBookList();
		List<GenreBean> genres = this.genreBusiness.getGenreList();
		
		req.setAttribute("BOOKS", books);
		req.setAttribute("GENRES", genres);
		req.getRequestDispatcher("jsp/home.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<BookBean> books = this.bookBusiness.getBookListByFilter(req.getParameter("bookName"),
																	 req.getParameter("authorName"),
																	 req.getParameter("genre"),
																	 req.getParameter("availible") != null);
		
		List<GenreBean> genres = this.genreBusiness.getGenreList();
		
		req.setAttribute("BOOKS", books);
		req.setAttribute("GENRES", genres);

		req.getRequestDispatcher("jsp/home.jsp").forward(req, resp);
	}
}
