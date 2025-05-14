2)Write a Java program using all classes of collections framework

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
       
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> linkedList = new LinkedList<>(arrayList);

        
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        Set<Integer> treeSet = new TreeSet<>(hashSet);

   
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);


        Queue<String> priorityQueue = new PriorityQueue<>(Arrays.asList("Zebra", "Monkey", "Elephant", "Lion"));

        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
