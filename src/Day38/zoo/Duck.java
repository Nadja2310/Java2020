package Day38.zoo;

public class Duck extends Pet {
    private String wingsColor;

    Duck(String wingsColor, String name) {
        super(name);//наследовать констпуктор из родительского класса Pet
        this.wingsColor = wingsColor;
    }

    void qraqra() {
        System.out.println("Я крякаю!");
    }

    @Override
    void moves() {
        System.out.println("I can fly. "+getName());
    }

    @Override
    void sleeps() {
        System.out.println("I sleep 6 hours! "+getName());
    }
}
