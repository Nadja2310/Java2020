package Day8;

public class CoffeeMachine {
    public static void latte() {
        System.out.println("*********************");
        System.out.println("We are created latte for you");
        milk(49);
        coffee(30);
        water(70);
        System.out.println("*********************");

    }

    public static void cappuccino() {
        System.out.println("*********************");
        System.out.println("We are created cappuccino for you");
        milk(10);
        coffee(30);
        water(70);
        System.out.println("*********************");
    }

    public static void americano() {
        System.out.println("*********************");
        System.out.println("We are created americano for you");
        //milk(0);
        coffee(40);
        water(10);
        System.out.println("*********************");
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    private static void coffee(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }


}
