public class IndexOfA {
    public static void main(String[] args) {
        String string1 = "Graceful panda danced salsa, playing a jazzy trumpet, as a vibrant parrot sang along, creating a joyful atmosphere";

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == 'a') {
                System.out.println("Index of a is " + i);

            }
        }

    }
}