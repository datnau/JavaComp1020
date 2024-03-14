public class TestList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll);
		ll.add("Fred");
		System.out.println(ll);
		ll.add(55);
		System.out.println(ll);
		ll.add(7.01);
		System.out.println(ll);
		ll.add("last");
		System.out.println(ll);

		System.out.println(ll);
		System.out.print("Get the data t node 1: " + ll.getNode(1).getData());

	}
}