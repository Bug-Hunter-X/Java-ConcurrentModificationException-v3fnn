import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Solution 1: Using an Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("banana")) {
                iterator.remove();
            }
        }

        // Solution 2: Iterating in reverse order (less efficient)
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("banana")) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}