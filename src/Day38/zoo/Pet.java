package Day38.zoo;

abstract class Pet {
    private String name;
    private int age;
    private String breed;

    abstract void moves();

    abstract void sleeps();

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

}
class TestPet{
    public static void main(String[] args) {
        Duck duck= new Duck("weit","Donald");
        Cat cat=new Cat("Murka");
        DragonGorynych dragon= new DragonGorynych("black","Dragon Gorynych");
        dragon.fireBreath();
        dragon.moves();
        cat.moves();
        cat.sleeps();
        duck.moves();
        duck.sleeps();

    }
}
