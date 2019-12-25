package loginapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginapp.dao.LoginDAO;
@WebServlet("/register")
public class Register extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username=request.getParameter("uname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String conpass=request.getParameter("conpass");
		if((pass.equals(conpass))&&(username!="" & email!="" & pass!="")) {
			LoginDAO reg=new LoginDAO();
				try {
					reg.register(username,email,pass);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Registered.jsp");
				requestDispatcher.forward(request, response);
			} 
		else {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("Signup.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
