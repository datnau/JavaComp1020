interface IOrderedList {
    void insert(Comparable obj);

    Comparable get(int index);

    void remove(int index);

    int find(Comparable obj);

    int size();
}
