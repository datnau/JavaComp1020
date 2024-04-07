import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinkedList {
    private Node top;

    LinkedList() {
        top = null;
    }

    public Node getTop() {
        return top;
    }

    public void add(Object data) {
        if (top == null) {
            top = new Node(data, null);
        } else {
            addRec(top, new Node(data, null));
        }
    }

    private void addRec(Node start, Node newNode) {
        if (start.getLink() == null) {
            start.setLink(newNode);
        } else {
            addRec(start.getLink(), newNode);
        }
    }

    public String toString() {
        return toStringRec(top);
    }

    private String toStringRec(Node current) {
        if (current == null) {
            return "";
        } else {
            return current.getData().toString() + "\n" + toStringRec(current.getLink());

        }
    }

    public static LinkedList createLinkedList(String filename) {
        LinkedList newList = new LinkedList();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {

                Object data = tryParseInt(line.trim());
                newList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newList;
    }

    private static Object tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return value;
        }
    }

    public int getSum() {
        return getSumRec(top);
    }

    private int getSumRec(Node current) {
        if (current == null) {
            return 0;
        } else {
            Object data = current.getData();
            if (data instanceof Integer) {
                return (int) data + getSumRec(current.getLink());
            } else if (data instanceof String) {
                return ((String) data).length() + getSumRec(current.getLink());
            } else {
                return getSumRec(current.getLink());
            }
        }
    }

    public static Node getSmallestNode(Node start, Node smallest) {
        if (start == null) {
            return smallest;
        } else {
            if (start.compareTo(smallest) < 0) {
                smallest = start;
            }
            return getSmallestNode(start.getLink(), smallest);
        }
    }

    public Node getPreviousNode(Node toFind) {
        return getPreviousNodeRec(top, toFind);
    }

    private Node getPreviousNodeRec(Node current, Node toFind) {
        if (toFind == null || current == null || current.getLink() == toFind) {
            return null;
        } else {
            Node prev = getPreviousNodeRec(current.getLink(), toFind);
            if (prev == null && current == top) {
                return null;
            } else {
                return prev == null ? current : prev;
            }
        }
    }

    public void swap(Node n1, Node n2) {
        if (n1 == null || n2 == null || n1 == n2) {
            return;
        }

        Node prevN1 = getPreviousNode(n1);
        Node prevN2 = getPreviousNode(n2);

        if (prevN1 != null) {
            prevN1.setLink(n2);
        } else {
            top = n2;
        }

        if (prevN2 != null) {
            prevN2.setLink(n1);
        } else {
            top = n1;
        }

        Node temp = n1.getLink();
        n1.setLink(n2.getLink());
        n2.setLink(temp);
    }

    public void selectionSort() {
        selectionSortRec(top);
    }

    private void selectionSortRec(Node start) {
        if (start == null) {
            return;
        }

        Node smallestNode = start;
        Node current = start.getLink();
        while (current != null) {
            if (current.compareTo(smallestNode) < 0) {
                smallestNode = current;
            }
            current = current.getLink();
        }

        swap(start, smallestNode);
        selectionSortRec(start.getLink());
    }
}