public class QueueTest {
    public static void main(String[] args) {
        IQueue queue = new ArrayListQueue(3);
        System.out.println("Is Queue empty? " + queue.isEmpty());
        queue.enqueue(10);
        System.out.println("Is Queue empty? " + queue.isEmpty());
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Is Queue full? " + queue.isFull());

        System.out.println("Peek:" + queue.peek());
        System.out.println("Element after Dequeue:" + queue.dequeue());
        System.out.println("Element after Dequeue:" + queue.dequeue());
        System.out.println("Element after Dequeue:" + queue.dequeue());

        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}
