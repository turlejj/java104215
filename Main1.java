import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
  
 public boolean contains(T[] collection , T value){
        for(T item : collection){
            if(item.equals(value)){
                return true;
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
