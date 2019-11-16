package Person;

public class PersonTask {

	public static void main(String[] args) {
		
		//the same for other university roles like student or university person/worker
		UniversityPerson teacher = new UniversityPerson("UKSW", UniversityPerson.UniversityRole.Teacher);
		teacher.age = 34;
		teacher.name = "John";
		teacher.surname = "Kavinsky";
		
		teacher.introduceYourself();
		teacher.introduceYourUniversityRole();
		
		VipPerson vip = new VipPerson(true);
		vip.age = 22;
		vip.name = "Mike";
		vip.surname = "Yoyo";
		
		vip.introduceYourself();
		vip.introduction();
	}
}
