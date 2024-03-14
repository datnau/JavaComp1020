
public class ArrayClass implements DataClass {
    private int[] dataArray;
    private int size;

    public ArrayClass(int capacity) {
        dataArray = new int[capacity];
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
        } else {
            System.out.println("Element not found in array.");
        }
    }

    @Override
    public void displayElements() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
    }
}
