import java.util.ArrayList;

class ArrayListClass implements IData {
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
        dataList.remove(element);

    }

    @Override
    public void displayElements() {
        for (int element = 0; element < dataList.size(); element++) {
            System.out.print(dataList.get(element) + " ");
        }
        System.out.println();
    }
}