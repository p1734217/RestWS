/**
 * 
 */
package controller;

import static org.junit.Assert.*;
import model.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import Dao.RegisterDao;
import Dao.impl.RegisterDaoImpl;

/**
 * @author Administrator
 *
 */
public class RegisterControllerTest {

	private MockHttpServletRequest request;

	private MockHttpServletResponse response;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link controller.RegisterController#register(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}
	 * .
	 */
	@Test
	public void testRegister() throws Exception {

//		request.setParameter("username", "pradeep");
//		request.setParameter("password", "password");
//		request.setParameter("country", "value");
//		request.setParameter("email", "value");
//
//		RegisterController obj = new RegisterController();
//		
//		obj.register(request, response);
//		
//		System.out.println(response.getContentAsString());

		 RegisterDaoImpl r=new RegisterDaoImpl();
		
		 User user=new User();
		 user.setUsername("hii");
		 user.setPassword("sjaj");
		 user.setCountry("rajisthani");
		 user.setEmail("sdfs");
		
		 System.out.println(user.toString());
		 assertEquals(true,r.register(user));

	}

	/**
	 * Test method for
	 * {@link controller.RegisterController#getdata(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}
	 * .
	 */
	@Test
	public void testGetdata() throws Exception {
		RegisterDaoImpl r = new RegisterDaoImpl();
		assertNotNull(r.getUser("pk"));
	}

}
