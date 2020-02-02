import java.util.HashSet;
import java.util.TreeSet;

public class Zadanie5 {
    public static void main(String[] args) {
        People2 person = new People2(69 , "Domm");
        People2 person1 = new People2( 22 , "Paul");
        People2 samePerson = new People2(69,"Domm");

        HashSet<People2> hashSet = new HashSet<>();
        hashSet.add(person);
        hashSet.add(person1);
        hashSet.add(samePerson);

        for (People2 peopleTemp:hashSet) {
            System.out.println(peopleTemp.hashCode());
            System.out.println(peopleTemp.equals(person));
        }

        TreeSet<People2>treeSetPeople = new TreeSet<>();

        treeSetPeople.addAll(hashSet);
        treeSetPeople.comparator();

        for (People2 peopleTemp:treeSetPeople) {
            System.out.println(peopleTemp.age);
        }

        TreeSet<People2>peopleTreeSet2 = new TreeSet<>();
        treeSetPeople.addAll(hashSet);
        treeSetPeople.comparator().reversed();


    }
}