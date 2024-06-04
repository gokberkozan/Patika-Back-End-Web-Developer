import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;
    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (size == array.length) {
            resize();
        }
        array[size++] = data;
    }

    private void resize() {
        int newCapacity = array.length * 2;
        T[] newArray = Arrays.copyOf(array, newCapacity);
        array = newArray;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removedElement;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldValue = array[index];
        array[index] = data;
        return oldValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(array[i], data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            throw new IllegalArgumentException("Invalid indices");
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}