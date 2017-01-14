/**
 * 
 */
package Dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;

import model.User;
import Dao.RegisterDao;

/**
 * @author Administrator
 *
 */
public class RegisterDaoImpl implements RegisterDao{

	public boolean register(User user) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepu","root","root");  
		  
		PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");  
		  
		ps.setString(1,user.getUsername());  
		ps.setString(2,user.getPassword());  
		ps.setString(3,user.getEmail());  
		ps.setString(4,user.getCountry());  
		          
		if(ps.executeUpdate()>0)  
			return true;
		
		return false;
	}

	public User getUser(String email) throws Exception {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepu", "root", "root");
		
				Statement stmt = con.createStatement();
				String sql="select * from deepu.register where email ='"+ email+"'";
				ResultSet rs = stmt.executeQuery(sql);
				User user = new User();

				while(rs.next()){
					
					user.setUsername(rs.getString("username"));
					user.setEmail(rs.getString("email"));
					user.setCountry(rs.getString("country"));
					user.setPassword(rs.getString("password"));
					System.out.println("User: "+user);
					
					return user;
				}
		return user;
	}

}
