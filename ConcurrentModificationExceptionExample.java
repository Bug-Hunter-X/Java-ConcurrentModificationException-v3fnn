public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        for (String item : list) {
            if (item.equals("banana")) {
                list.remove(item); // ConcurrentModificationException
            }
        }
    }
}