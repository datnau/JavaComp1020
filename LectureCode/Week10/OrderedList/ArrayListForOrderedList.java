
import java.util.ArrayList;

class ArrayListForOrderedList implements IOrderedList {
    private ArrayList<Comparable> list;

    public ArrayListForOrderedList() {
        list = new ArrayList<>();
    }

    public void insert(Comparable obj) {
        int index = 0;
        while (index < list.size() && obj.compareTo(list.get(index)) > 0) {
            index++;
        }
        list.add(index, obj);
    }

    public Comparable get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int find(Comparable obj) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return list.size();
    }
}
