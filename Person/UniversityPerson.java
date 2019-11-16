package Person;

public class UniversityPerson extends Person {

	public String universityName;
	public UniversityRole universityRole;
	
	public UniversityPerson(String universityName, UniversityRole role) {
		this.universityName = universityName;
		this.universityRole = role;
	}
	
	public void introduceYourUniversityRole() {
		System.out.println("Im " + this.universityRole + " at " + this.universityName);
	}
	
	

	public enum UniversityRole{
		Teacher,Student, UniversityWorker;
	}
	
}


