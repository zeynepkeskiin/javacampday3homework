package homeworkday3;

public class UserManager {
	
	public void addUser(User user){
		System.out.println("Kullanıcı eklendi" + user.getFirstName());
		
	
		}
	
	public void deleteUser(User user){
		System.out.println("Kullanıcı silindi " + user.getFirstName());
	}
	
	public void updateUser(User user){
		System.out.println("Kullanıcı güncellendi " +user.getFirstName()); 
	}
	
	public void addMultiple(User[] users) {
		for (User  user : users) {
			addUser(user);
		}
	}
			


}
