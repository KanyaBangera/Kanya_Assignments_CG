package Que6;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserDB")
public class UserDB {
	
	@Value("${dburl}")
	private String dburl;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
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
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDB [dburl=" + dburl + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
