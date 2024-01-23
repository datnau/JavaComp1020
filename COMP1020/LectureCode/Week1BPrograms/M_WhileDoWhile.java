public class M_WhileDoWhile {

    public static void main(String[] args) {
        int counter = 0;
        int anotherCounter = 12;
        System.out.println("***While loop***");
        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        } 
        do{
            System.out.println("***Do While loop***");
            System.out.println(anotherCounter);
            anotherCounter++;
    
        
    } while(anotherCounter<=5);
}
}