package model.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.UserBusiness;
import model.MD5;
import model.bean.UserBean;

@WebServlet(name="signinservlet", urlPatterns= {"/signin"})
public class SigninServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private UserBusiness userBusiness;

	@Override
	public void init() throws ServletException {
		this.userBusiness = new UserBusiness();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("jsp/signin.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserBean user = new UserBean();
		user.setUsername(req.getParameter("username"));
		user.setPassword(MD5.getMd5(req.getParameter("password")));
		
		if (!this.userBusiness.userExists(user) && req.getParameter("password").equals(req.getParameter("password2")))
		{
			this.userBusiness.insertUser(user);
			resp.sendRedirect("login");
		}
		else
		{
			resp.sendRedirect("signin");
		}
	}

}
