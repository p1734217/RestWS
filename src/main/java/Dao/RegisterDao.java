/**us
 * 
 */
package Dao;

import model.User;

/**
 * @author Administrator
 *
 */
public interface RegisterDao {

	public boolean register(User user)throws Exception;
	public User getUser(String email)throws Exception;
	
}
