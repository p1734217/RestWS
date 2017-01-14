package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class LoginController extends MultiActionController{
	
	
	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		JSONObject obj= new JSONObject();
		obj.put("pradeep","hello pradeep");
	
		response.getWriter().print(obj);
	}
	
  	
  public void login(HttpServletRequest request, HttpServletResponse response) throws Exception{
     JSONObject obj= new JSONObject();
     try
     {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        
        System.out.println("username " + username + "  password "+ password);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepu","root","root");
        Statement stmt=con.createStatement();
        System.out.println("hello");
        ResultSet rs=stmt.executeQuery("select * from register where username='" + username + "' and password='" +password + "'");
        boolean flag=false;
        while(rs.next()){
        	
        	String s=rs.getString("username");
        	String str=rs.getString("password");
        	
        	if(s.equalsIgnoreCase(username) && str.equalsIgnoreCase(password)){
        		flag=true;
        	}
        } 
        if(flag==true)
        	obj.put("result", "success");
        else
        	obj.put("result", "invalid credentials");
     }
     catch(Exception e){    
    	 System.out.println(e);
    	 obj.put("result", "error");
     }
     finally{
    	 response.getWriter().print(obj);
     }
  }
	
}
