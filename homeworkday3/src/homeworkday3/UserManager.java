package homeworkday3;

public class UserManager {
	
	public void addUser(User user){
		System.out.println("Kullanýcý eklendi" + user.getFirstName());
		
	
		}
	
	public void deleteUser(User user){
		System.out.println("Kullanýcý silindi " + user.getFirstName());
	}
	
	public void updateUser(User user){
		System.out.println("Kullanýcý güncellendi " +user.getFirstName()); 
	}
	
	public void addMultiple(User[] users) {
		for (User  user : users) {
			addUser(user);
		}
	}
			


}
