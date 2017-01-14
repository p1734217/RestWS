/**
 * 
 */
package model;

/**
 * @author Administrator
 *
 */
public class User {

	private String username;
	private String password;
	private String email;
	private String country;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", email=" + email + ", country=" + country + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
