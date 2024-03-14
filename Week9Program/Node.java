public class Node {
    // instance variables
    private Object data;
    private Node link;

    // constructor
    public Node(Object initData, Node initLink) {
        data = initData;
        link = initLink;
    }

    // getter and setter for 'data'
    public Object getData() {
        return data;
    }

    public void setData(Object newData) {
        data = newData;
    }

    // getter and setter for 'link'
    public Node getLink() {
        return link;
    }

    public void setLink(Node newLink) {
        link = newLink;
    }
}