import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class MyIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int index = 0;

    public MyIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        return collection.get(index++);
    }
}

// Usage Example:
public class IteratorPatternExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        MyIterator<Integer> iterator = new MyIterator<>(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
