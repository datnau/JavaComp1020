public class LinkedList {
	// instance variable
	private Node top;

	// Constructor
	public LinkedList() {
		top = null;
	}

	//
	// Instance methods
	//

	// adding at the beginning
	public void add(Object newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
	}

	// toString
	public String toString() {
		String answer = "<< ";
		Node current = top;
		while (current != null) {
			answer += current.getData() + " ";
			current = current.getLink();
		}
		return answer + ">>";
	}

	// getNode returns node at a specific position if it exists or null otherwise
	public Node getNode(int n) {
		Node current = top;

		while (n > 0) {
			if (current == null)
				return null;
			current = current.getLink();
			n--;
		}

		return current;
	}
}