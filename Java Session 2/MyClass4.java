import java.util.*;

public class MyClass4{
	// 6. Collection
	public static void main(String[] args) {
		// insertion order preserved and duplicate allowed
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
		list.add("Apple");

        System.out.println("Elements in ArrayList: " + list);
		
		// insertion order not preserved and duplicate not allowed
		Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
		set.add(10);

        System.out.println("Elements in HashSet: " + set);
		
		// Map Key value pair
		Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 28);

        System.out.println("Entries in HashMap: " + map);
		
		// Uses Heap inside which maintain sorting
		Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Elements in PriorityQueue: " + queue);
		
		// It's double ended queue
		Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Elements in ArrayDeque: " + deque);
    }
}
