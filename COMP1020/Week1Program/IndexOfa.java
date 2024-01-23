public class IndexOfa {
    public static void main(String[] args) {
        String inputString = "Graceful panda danced salsa, playing a jazzy trumpet, as a vibrant parrot sang along, creating a joyful atmosphere";
        System.out.println("\nIndexes of 'a': ");

        printIndexesOfA(inputString);
    }

    static void printIndexesOfA(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == 'a') {
                System.out.print(i + " ");
            }
        }
    }
}
