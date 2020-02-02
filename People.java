public class People {
    public int age;
    public String name;
    public String surname;

    public People(int age , String name , String surname){
        this.age = age;
        this.surname = surname;
        this.name = name;
    }

    public String getInfo(){
        return "Imie: " + this.name + " wiek: " + this.age + " nazwisko: " + this.surname;
    }
}