import java.util.ArrayList;

public class ObjectArrayList implements IObjectList {
    private ArrayList<Object> list;

    public ObjectArrayList() {
        list = new ArrayList<>();
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public void set(int index, Object obj) throws IndexOutOfBoundsException {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        list.set(index, obj);
    }

    public int size() {
        return list.size();
    }
}
