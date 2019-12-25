package loginapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	
public boolean checkCredential(String username, String password) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","admin");
	String query="select * from UserData where username=? and password=?";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1, username);
	pst.setString(2, password);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		return true;
	}
		
}catch(Exception e) {
	System.out.println(e);
}
return false;	
}

public void register(String username, String email, String password) throws ClassNotFoundException, SQLException {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","admin");
	String query="insert into UserData values(?,?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1, username);
	pst.setString(2, email);
	pst.setString(3, password);
	pst.executeUpdate();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public void classify(String classifier_name)  {
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","admin");
	/*String query="insert into Classify values(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1, classifier_name);
	pst.setString(2, );
	pst.setString(3, password);
	pst.executeUpdate();*/
	String query="create table classifier(" + classifier_name + " varchar2(30),update_req varchar2(2000),issue varchar2(1000),beta varchar2(500),appreciation varchar2(500),community_content varchar2(2000))";
	Statement st=con.createStatement();
	st.executeUpdate(query);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}

