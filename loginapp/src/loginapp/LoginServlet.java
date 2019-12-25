package loginapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginapp.dao.LoginDAO;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		//RequestDispatcher requestDispatcher=null;
		LoginDAO credential=new LoginDAO();
				if(credential.checkCredential(uname,pwd)) {
				HttpSession session=request.getSession();
				session.setAttribute("username_", uname);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Success.jsp");
				requestDispatcher.forward(request, response); 
			}
			else {
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Failure.html");
				requestDispatcher.forward(request, response); 
			}		
	}

}
