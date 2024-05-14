import java.util.HashSet;
import java.util.Set;

public class Main {
 public static void main(String[] args) {
   Set<String> food = new HashSet<String>();
   food.add("Cabbage");
   food.add("Pizza");
   food.add("Sausage");
   food.add("Potatoes");
   food.add("Salad");
   food.remove("Sausage");
   System.out.println(food.contains("Sausage"));
   System.out.println(food);
   System.out.println(food.size());
 }
}
