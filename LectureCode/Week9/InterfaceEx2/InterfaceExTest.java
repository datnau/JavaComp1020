
public class InterfaceExTest {

    public static void main(String[] args) {
        Cat myCat = new Cat("Ginger", 2);
        IMakeNoise iCat = myCat;
        System.out.println(myCat);
        iCat.makesNoise();
        Dog myDog = new Dog("Tommy", 4);
        IAnimalStuff iDog = myDog;
        System.out.println(myDog);

        iDog.eat("Mouse, fish etc.");
        iDog.drink();

    }

}