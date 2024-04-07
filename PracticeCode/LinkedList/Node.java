package LinkedList;

public class Node {
    private Object data;
    private Node link;

    public Node(Object initData, Node initLink) {
        data = initData;
        link = initLink;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return link;
    }

    // Getters and setters for link if needed
}
