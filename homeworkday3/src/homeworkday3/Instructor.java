package homeworkday3;

public class Instructor extends User {
	private  String givenCourses;
	
		public String getGivenCourses() {
		return givenCourses;
	}
		public Instructor() {
			
		}

	public Instructor(String givenCourses) {
			super();
			this.givenCourses = givenCourses;
			
		}
	
	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	
	
	
	
	

}
