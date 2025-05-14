1)Write a Java program to display objects using Iterators, Enumerations, advanced For Loop.

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DisplayDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("Using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Elephant");
        vector.add("Fox");

        System.out.println("\nUsing Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Using advanced for loop
        System.out.println("\nUsing Advanced For Loop:");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
