package Person;

public class Person implements PersonIntroduction {

	public int age;
	public String name;
	public String surname;
	
	
	@Override
	public void introduceYourself() {
		System.out.println("Im " + this.name + " " + this.surname + " and Im " + this.age + " years old.");
		
	}
	
	
}
