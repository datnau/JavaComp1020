public interface IStackInterface {
    void push(Object obj);

    Object pop();

    boolean isEmpty();

    boolean isFull();

    Object peek();
}