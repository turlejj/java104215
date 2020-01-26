import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {
		
  public static void main(String[] args) {

		Map<Integer,Person> map = new HashMap<Integer,Person>();
		Person p1 = new Person("Jan");
		Person p2 = new Person("Xyz");
		
		map.put(1234,p1);
		map.put(5678, p2);
		
		System.out.println("Czlowiek o peselu 1234 to " + map.get(1234));

  }
}
