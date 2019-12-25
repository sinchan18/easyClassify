package loginapp;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginapp.dao.LoginDAO;
@WebServlet("/create")
public class Create extends HttpServlet{
      public void doPost(HttpServletRequest request, HttpServletResponse response) {
    	  String classifier=request.getParameter("classifier");
    	  LoginDAO cls=new LoginDAO();
    	  cls.classify(classifier);
      }
}
