
public class ObjectArray implements IObjectList {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ObjectArray() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(Object obj) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = obj;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return array[index];
    }

    public void set(int index, Object obj) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        array[index] = obj;
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
