import java.util.ArrayList;

class ArrayListClass implements DataClass {
    private ArrayList<Integer> dataList;

    public ArrayListClass() {
        dataList = new ArrayList<>();
    }

    @Override
    public void addElement(int element) {
        dataList.add(element);
    }

    @Override
    public void removeElement(int element) {
        dataList.remove(Integer.valueOf(element));
    }

    @Override
    public void displayElements() {
        System.out.print("ArrayList elements: ");
        for (int element = 0; element < dataList.size();element++) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}