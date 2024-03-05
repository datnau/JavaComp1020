public class DirectionListTest {
    public static void main(String[] args) {
        testAddingDirections();
        testAllDirections();
    }

    private static void testAddingDirections() {
        DirectionList directionList = new DirectionList();
        directionList.addDirection(new Direction(-1, 0));
        directionList.addDirection(new Direction(1, 0));
        directionList.addDirection(new Direction(0, -1));

        System.out.println("Adding directions test:");
        for (int i = 0; i < directionList.length(); i++) {
            System.out.println(directionList.getDirection(i));
        }
    }

    private static void testAllDirections() {
        System.out.println("\nAll directions test:");
        DirectionList allDirections = DirectionList.allDirections();
        for (int i = 0; i < allDirections.length(); i++) {
            System.out.println(allDirections.getDirection(i));
        }
    }
}
