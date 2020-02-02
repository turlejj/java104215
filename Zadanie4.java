import java.util.*;

public class Zadanie4 {

    public static void main(String[] args) {
        People person = new People(22,"Jan","Nowak");
        People person2 = new People(77 , "Dawid","Zboj");
        People person3 = new People(69 , "Ania","Bania");

        List<People> peopleList = new ArrayList<>();
        peopleList.add(person);
        peopleList.add(person2);
        peopleList.add(person3);

        for (People temp: peopleList) {
           System.out.println(temp.getInfo());
        }

        peopleList.sort(Comparator.comparingInt(a -> a.age));
        Collections.reverse(peopleList);
        for (People temp: peopleList) {
            System.out.println(temp.getInfo());
        }

        peopleList.sort(Comparator.comparing(a -> a.age));
        Collections.reverse(peopleList);
        for (People temp: peopleList) {
            System.out.println(temp.getInfo());
        }
    }
}