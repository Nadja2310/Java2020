package Day38.zoo;

public class Dog extends Pet {
    String color;
    String dogSize;

    @Override
    void moves() {
        System.out.println("I can run!");
    }

    @Override
    void sleeps() {
        System.out.println("I sleep 10 hours! Dog");
    }

    void barks() {
        System.out.println("Gav-gav!");
    }
}
