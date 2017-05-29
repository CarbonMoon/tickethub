
public class User {
	private String name;
	private char[] password;	//TODO ACTUAL SAFE PASSWORD HANDLING
	private char type;	//a for admin, u for user
	
	public User(String name, char type){
		this.name = name;
		this.type = type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public char getType(){
		return this.type;
	}
	
	public boolean correctPass(String in){
		return true;
	}
	
	
	
}
