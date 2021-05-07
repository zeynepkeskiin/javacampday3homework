package homeworkday3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kursa Hoşgeldiniz");
		
		
		Student student1 = new Student();
		student1.id=1;
		student1.firstName="Zeynep";
		student1.lastName= "Keskin";
		student1.email="zeyzey11@hotmail.com";
		student1.password="freeelf";
		student1.userName= "zeyzey";
		
		Student student2 = new Student();
		student2.id=2;
		student2.firstName="Talha";
		student2.lastName= "Söz";
		student2.email="talhahaha@hotmail.com";
		student2.password="talha121212";
		student2.userName= "talha.12";
		
		
	   System.out.println("*********************************\n");
		
		Instructor instructor1 = new Instructor();
		instructor1.id =2;
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroğ";
		instructor1.email="engininin@hotmail.com";
		instructor1.password= "1234";
		instructor1.userName= "engindemiroğ1213";
	
		UserManager userManager= new UserManager();
		User[] users = {student1,student2,instructor1};
		for (User user : users) {
			System.out.println(user.firstName);
		}
		userManager.addMultiple(users);
		
		System.out.println("\n***************************");
		
		
		
		
		
		
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.addGivenCourses("Java");
		instructorManager1.deleteGivenCourses("Java");
		instructorManager1.updateGivenCourses("Java");
		
		System.out.println("*********************************\n");
		
		
		InstructorManager instructorManager2 = new InstructorManager();
		instructorManager2.addGivenCourses("C#");
		instructorManager2.deleteGivenCourses("C#");
		instructorManager2.updateGivenCourses("C#");
		
		System.out.println("*********************************\n");
		
		
		StudentManager studentManager1= new StudentManager();
		studentManager1.addMyCourses("Java");
		studentManager1.deleteMyCourses("Java");
		studentManager1.updateMyCourses("Java");
		
		System.out.println("*********************************\n");
		
		
		StudentManager studentManager2= new StudentManager();
		studentManager2.addMyCourses("C#");
		studentManager2.deleteMyCourses("C#");
		studentManager2.updateMyCourses("C#");
		
		
		
		
		
		
		
	}

}
