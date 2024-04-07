public class Node {

	private Object data;
	private Node link;

	public Node(Object initData, Node initLink) {
		data = initData;
		link = initLink;
	}

	public Object getData() {
		return data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node newLink) {
		link = newLink;
	}

	public int compareTo(Node other) {
		Object thisData = this.getData();
		Object otherData = other.getData();

		// Check if both data are integers
		if (thisData.getClass() == Integer.class && otherData.getClass() == Integer.class) {
			return ((Integer) thisData).compareTo((Integer) otherData);
		}
		// Check if both data are strings
		else if (thisData.getClass() == String.class && otherData.getClass() == String.class) {
			return ((String) thisData).compareTo((String) otherData);
		} else {
			// For any other type of data, return a positive or negative number
			return 1; // You could use -1 as well
		}
	}
}