public class Node {
	// instance variables
	private Object data;
	private Node link;

	// Constructor
	public Node(Object initData, Node initLink) {
		data = initData;
		link = initLink;
	}

	// Instance methods

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