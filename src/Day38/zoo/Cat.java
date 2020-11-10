package Day38.zoo;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    void moves() {
        System.out.println("I can climb trees! "+getName());
    }

    @Override
    void sleeps() {
        System.out.println("I sleep in the daytime. "+getName());
    }
}
