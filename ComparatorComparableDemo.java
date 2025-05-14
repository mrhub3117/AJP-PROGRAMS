3)Write a Java program to sort objects using Comparator and Comparable.

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }


    public String toString() {
        return name + " - " + age;
    }
}


class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class ComparatorComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        
        Collections.sort(students);
        System.out.println("Sorted by name (Comparable): " + students);

        
        students.sort(new AgeComparator());
        System.out.println("Sorted by age (Comparator): " + students);
    }
}
