11)iterator
import java.util.ArrayList;
import java.util.List;


interface Iterator {
    boolean hasNext();
    Object next();
}


interface IterableCollection {
    Iterator getIterator();
}


class NameCollection implements IterableCollection {
    private List<String> names = new ArrayList<>();

    public NameCollection() {
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
    }

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index = 0;

        public boolean hasNext() {
            return index < names.size();
        }

        public Object next() {
            if (hasNext()) {
                return names.get(index++);
            }
            return null;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
