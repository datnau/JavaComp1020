public class Node {
    public Object data;
    public Node link;

    public Node(Object initData, Node intiLink) {

        data = initData;
        link = intiLink;
    }

    public Object getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setLink(Node newLink) {
        link = newLink;
    }

}
