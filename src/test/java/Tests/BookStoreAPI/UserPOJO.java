package Tests.BookStoreAPI;

public class UserPOJO {
	private String userName;
	private String password;
	
	public UserPOJO(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

//	@Override
//	public String toString() {
//		return "UserPOJO [userName=" + userName + ", password=" + password + "]";
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
