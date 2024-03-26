
public class ArrayClass implements IData {
    private int[] dataArray;
    private int size;

    public ArrayClass(int numberOfElements) {
        dataArray = new int[numberOfElements];
        size = 0;
    }

    @Override
    public void addElement(int element) {
        if (size < dataArray.length) {
            dataArray[size++] = element;
        } else {
            System.out.println("Array is full. Cannot add element.");
        }
    }

    @Override
    public void removeElement(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (dataArray[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                dataArray[i] = dataArray[i + 1];
            }
            size--;
        }
    }

    @Override
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
    }
}
