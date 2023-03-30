package model.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import business.BookBusiness;
import business.BookBusinessImpl;

@WebServlet(name="ListBookServlet", urlPatterns= {"/", "/books"})
public class ListBookServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BookBusiness business;

	@Override
	public void init() throws ServletException {
	    this.business = new BookBusinessImpl();
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("jsp/home.jsp").forward(req, resp);
	}

}
