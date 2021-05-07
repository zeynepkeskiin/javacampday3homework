package homeworkday3;

public class Student extends User{
	private  String myCourses;

	public Student() {
		
	}
	

	public Student(String myCourses) {
		super();
		this.myCourses = myCourses;
	}


	public String getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses) {
		this.myCourses = myCourses;
	}
	
	

}
