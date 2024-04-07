package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<InterfaceDongVat> pet = new ArrayList<>();
        pet.add(new Cat());
        pet.add(new Dog());
        for (InterfaceDongVat p : pet) {
            p.action();

        }

    }
}
