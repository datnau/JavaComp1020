import java.util.ArrayList;

public class StringArrayList implements IObjectList {
    private ArrayList<Object> objList;

    public StringArrayList() {
        objList = new ArrayList<>();
    }

    public void add(Object obj) {
        objList.add(obj);
    }

    public Object get(int index) throws IllegalArgumentException {
        Object obj = objList.get(index);
        if (obj instanceof String) {
            return (String) obj;
        } else {
            throw new IllegalArgumentException("Object at index " + index + " is not a String");
        }
    }

    public void set(int index, Object obj) {
        if (index < 0 || index >= objList.size()) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        objList.set(index, obj);
    }

    public int size() {
        return objList.size();
    }
}
