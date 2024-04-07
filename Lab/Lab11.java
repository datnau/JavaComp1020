public class Lab11 {
  public static void main(String args[]) {
    IntLinkedList list = createList();
    IntLinkedList list2 = new IntLinkedList();

    System.out.println("Exercise 1, expected output is: [ 0 111 222 333 444 ]");
    System.out.println(list);
    System.out.println("Exercise 1, expected output is: [ ]");
    System.out.println(list2);

    // Exercise 2:
    System.out.println("\nsum():");
    verifyInt(1110, list.sum(), list + ".sum()");
    verifyInt(0, list2.sum(), list + ".sum()");
    list.add(1);
    verifyInt(1111, list.sum(), list + ".sum()");
    list = createList();

    // Exercise 3:
    System.out.println("\nremoveFirst():");
    list.removeFirst();
    verifyBoolean(true, list.matches(new int[] { 111, 222, 333, 444 }), "removeFirst()");
    list.removeFirst();
    verifyBoolean(true, list.matches(new int[] { 222, 333, 444 }), "removeFirst()");
    list.removeFirst();
    verifyBoolean(true, list.matches(new int[] { 333, 444 }), "removeFirst()");
    list.removeFirst();
    verifyBoolean(true, list.matches(new int[] { 444 }), "removeFirst()");
    list.removeFirst();
    verifyBoolean(true, list.matches(new int[] {}), "removeFirst()");
    list = createList();

    // Exercise 4:
    System.out.println("\nreplace():");
    verifyBoolean(true, list.replace(0, -999), list + ".replace(0, -999)");
    verifyBoolean(true, list.matches(new int[] { -999, 111, 222, 333, 444 }), "checking values after replace()");
    verifyBoolean(true, list.replace(4, 555), list + ".replace(4, 555)");
    verifyBoolean(true, list.matches(new int[] { -999, 111, 222, 333, 555 }), "checking values after replace()");
    verifyBoolean(false, list.replace(-1, 12345), list + ".replace(-1, 12345)");
    verifyBoolean(true, list.matches(new int[] { -999, 111, 222, 333, 555 }), "checking values after replace()");
    verifyBoolean(false, list.replace(5, 12345), list + ".replace(5, 12345)");
    verifyBoolean(true, list.matches(new int[] { -999, 111, 222, 333, 555 }), "checking values after replace()");
    list = createList();

    // Exercise 5:
    System.out.println("\naddToEnd():");
    list2.addToEnd(1);
    verifyBoolean(true, list2.matches(new int[] { 1 }), "addToEnd(1)");
    list2.addToEnd(2);
    verifyBoolean(true, list2.matches(new int[] { 1, 2 }), "addToEnd(2)");
    list2.addToEnd(3);
    verifyBoolean(true, list2.matches(new int[] { 1, 2, 3 }), "addToEnd(3)");
    list.addToEnd(999);
    verifyBoolean(true, list.matches(new int[] { 0, 111, 222, 333, 444, 999 }), "addToEnd(4)");
    list = createList();

    // Exercise 6:
    System.out.println("\nslice():");
    list2 = list.slice(1, 2);
    verifyBoolean(true, list.matches(new int[] { 0, 333, 444 }), "list.slice(1,2)");
    verifyBoolean(true, list2.matches(new int[] { 111, 222 }), "list2 after slice");
    list = createList();
    list2 = list.slice(3, 10);
    verifyBoolean(true, list.matches(new int[] { 0, 111, 222 }), "list.slice(1,2)");
    verifyBoolean(true, list2.matches(new int[] { 333, 444 }), "list2 after slice");
    list = createList();
    list2 = list.slice(0, 5);
    verifyBoolean(true, list.matches(new int[] {}), "list.slice(1,2)");
    verifyBoolean(true, list2.matches(new int[] { 0, 111, 222, 333, 444 }), "list2 after slice");
    list = createList();
    list2 = list.slice(6, 1);
    verifyBoolean(true, list.matches(new int[] { 0, 111, 222, 333, 444 }), "list.slice(1,2)");
    verifyBoolean(true, list2.matches(new int[] {}), "list2 after slice");
    list = createList();
    list2 = list.slice(0, 0);
    verifyBoolean(true, list.matches(new int[] { 0, 111, 222, 333, 444 }), "list.slice(1,2)");
    verifyBoolean(true, list2.matches(new int[] {}), "list2 after slice");

    System.out.println("\nEnd of processing.");
  }

  public static IntLinkedList createList() {
    IntLinkedList list = new IntLinkedList();

    list.add(444);
    list.add(333);
    list.add(222);
    list.add(111);
    list.add(0);

    return list;
  }

  public static void verifyBoolean(boolean expected, boolean result, String action) {
    if (expected == result) {
      System.out.printf("Test succeeded: %s\n", action);
    } else {
      System.out.printf("Test FAILED (expected %b, got %b): %s\n", expected, result, action);
    }
  }

  public static void verifyInt(int expected, int result, String action) {
    if (expected == result) {
      System.out.printf("Test succeeded, got %d: %s\n", result, action);
    } else {
      System.out.printf("Test FAILED (expected %d, got %d): %s\n", expected, result, action);
    }
  }
}

class IntNode {
  public int data;
  public IntNode next;

  public IntNode(int data, IntNode next) {
    this.data = data;
    this.next = next;
  }
}

class IntLinkedList {
  private IntNode top;

  public IntLinkedList() {
    this.top = null;
  }

  public void add(int data) {
    top = new IntNode(data, top);
  }

  // Exercise 1:
  public String toString() {
    IntNode curr = top;
    String result = "[ ";

    while (curr != null) {
      result += curr.data + " ";
      curr = curr.next;
    }

    return result + "]";
  }

  // Exercise 2:
  public int sum() {
    int result = 0;
    IntNode curr = top;

    while (curr != null) {
      result += curr.data;
      curr = curr.next;
    }

    return result;
  }

  // Exercise 3:
  public void removeFirst() {
    if (top != null) {
      top = top.next;
    }
  }

  // Exercise 4:
  public boolean replace(int pos, int value) {
    IntNode curr = top;
    boolean result = false;
    int index = 0;

    while (curr != null && index < pos) {
      curr = curr.next;
      index++;
    }

    if (curr != null && index == pos) {
      curr.data = value;
      result = true;
    }

    return result;
  }

  // Exercise 5:
  public void addToEnd(int value) {
    IntNode curr = top;

    if (curr == null) {
      top = new IntNode(value, null);
      return;
    }

    while (curr.next != null) {
      curr = curr.next;
    }

    curr.next = new IntNode(value, null);
  }

  // Exercise 6:
  public IntLinkedList slice(int start, int len) {
    IntLinkedList slice = new IntLinkedList();
    IntNode curr = top;
    int index = 0;

    // Move curr to the start position
    while (curr != null && index < start) {
      curr = curr.next;
      index++;
    }

    // Copy len elements from curr to slice
    while (curr != null && len > 0) {
      slice.add(curr.data);
      curr = curr.next;
      len--;
    }

    return slice;
  }

  // This is used to make sure the list contains the correct values
  public boolean matches(int[] a) {
    int aPos = 0;
    IntNode curr = top;
    boolean matches = true;

    while (curr != null && matches) {
      if (aPos == a.length) {
        matches = false;
      } else {
        if (curr.data != a[aPos]) {
          matches = false;
        }
        aPos++;
        curr = curr.next;
      }
    }
    if (aPos != a.length) {
      matches = false;
    }

    return matches;
  }
}
