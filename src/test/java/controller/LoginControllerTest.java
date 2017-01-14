package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class LoginControllerTest {

private MockHttpServletRequest request;
	
	private MockHttpServletResponse response;
	
	@Before
	public void setUp() throws Exception {
		
		request=new MockHttpServletRequest();
		response=new MockHttpServletResponse();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTest() {
		
	}

	@Test
	public void testLogin() throws Exception{
		request.setParameter("username", "pradeep");
		request.setParameter("password", "kumar");
		LoginController obj= new LoginController();
		obj.login(request, response);
		System.out.println(response.getContentAsString());
		
		
	}

}
