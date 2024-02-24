import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        // add new values into the array list
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("noodle");
        food.add(1, "rice");
        System.out.println("The array list after adding elements: " + food);
        // the array list now is food = [pizza,rice,hamburger,hotdog,noodle]

        food.set(0, "bacon");
        food.set(4, "beefsteak");
        System.out.println("Array List after setting new elements: " + food);
        // the array list now is food = [bacon,rice,hamburger,hotdog,beefsteak]

        food.remove(2);// the array list now is food = [bacon,rice,hotdog,beefsteak]
        food.remove(2);// the array list now is food = [bacon,rice,beefsteak]
        food.remove("rice");// the array list now is food = [bacon,beefsteak]
        System.out.println("Array List after removing elements: " + food);

        // getting an element
        System.out.println("The element of index 0 is: " + food.get(0));

        // Changing an element
        String newFood = "honey";
        System.out.println("Old element replaced: " + food.set(1, newFood));
        System.out.println("Array List now is: " + food);

        // Finding index of an element
        System.out.println("The index of hotdog is: " + food.indexOf("hotdog"));
        System.out.println("the index of honey is: " + food.indexOf(newFood));
        food.add("bacon");
        System.out.println("Array List now is: " + food);
        System.out.println("Searching from the other end: " + food.lastIndexOf("bacon"));

        // Containg method
        System.out.println("Does array list contain rice? " + food.contains("rice"));

        // Clear an array list
        food.clear();
        System.out.println("Array List now is: " + food);

        // for (int i = 0; i < food.size(); i++) {
        // System.out.println(food.get(i));
        // }
    }
}
