package Day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = 2;
        VendigMachine(button);
    }


    private static void VendigMachine(int knopka) {

        switch (knopka) {
            case 1:
                System.out.println("Americano");
                break;
            case 2:
                System.out.println("Expresso");
                break;
            case 4:
                System.out.println("Water");
                System.out.println("Koffe");
                System.out.println("Sahne");
                break;
            default:
                System.out.println("Noch mal");
                break;

        }
        System.out.println("End");
    }
}