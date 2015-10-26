
public class HelloUser {

	private String username;	
	

	public HelloUser(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void greetUser(){
		System.out.println("Hello "+this.getUsername()+"!\n");
	}
}
