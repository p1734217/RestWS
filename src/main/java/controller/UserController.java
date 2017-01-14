/**
 * 
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;



/**
 * @author Administrator
 * @date: 
 */
///http://localhost:8081/RestWS/user?q=getUser
public class UserController extends MultiActionController {

	public void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		JSONObject job=new JSONObject();
		try {
			job.put("data","its you babau");
			
		} catch (Exception e) {

		} finally {
			response.getWriter().print(job);	
		}
	}

	public void putUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		JSONObject job=new JSONObject();
		try {
			job.put("data","I am a MCA stuent");
			
		} catch (Exception e) {

		} finally {
			response.getWriter().print(job);	
		}
	}

public void netuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		JSONObject job=new JSONObject();
		try {
			job.put("data","I am a MCA pradeep");
			
		} catch (Exception e) {

		} finally {
			response.getWriter().print(job);	
		}
	}



}
