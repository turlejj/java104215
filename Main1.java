import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
  
public <T,L> boolean contains(List<T> list, L item) {
	for(int i = 0; i < list.size(); i++) {
		if(list.get(i).equals(item)) {
			return true;
		}
	}
	
	return false;
}
  public static void main(String[] args) {
    String[] array = {"element", "item"};
    String element1 = "element";
    String element2 = "element2";
    
    Main1 main = new Main1();
    System.out.println(main.contains(array, element1));
    System.out.println(main.contains(array, element2));
    
    
  }
}