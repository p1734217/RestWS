package controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import Dao.RegisterDao;
import Dao.impl.RegisterDaoImpl;

public class RegisterController extends MultiActionController{
	
	public void register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		JSONObject obj= new JSONObject();
		JSONArray ar=new JSONArray();
		try
		{
			String uname= request.getParameter("username");
			String password= request.getParameter("password");
			String email= request.getParameter("email");
			String country= request.getParameter("country");
			
			User user=new User();
			user.setUsername(uname);
			user.setPassword(password);
			user.setCountry(country);
			user.setEmail(email);
			
			RegisterDao r=new RegisterDaoImpl();
			
			if(r.register(user))
			  obj.put("result","success");
			
		}catch(Exception e)
		{
			System.out.println(e);
			obj.put("result","error");
		}
	 finally
	 {
		 response.getWriter().print(obj);
	 }
	}
	 
	public void getdata(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		JSONObject obj=new JSONObject();
		
		String email1= request.getParameter("email");
		
		User user= new User();
		RegisterDao p=new RegisterDaoImpl();
		
		user=p.getUser(email1);
		
		obj.put("email",user.getEmail());
		obj.put("country", user.getCountry());
		obj.put("username", user.getUsername());
		
		response.getWriter().print(obj);		
		
		
	}

}

