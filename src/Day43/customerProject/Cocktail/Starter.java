package Day43.customerProject.Cocktail;

import Day43.customerProject.Cocktail.Cocktail;

//Добавить несколько разных коктейлей.
//Вывести крепость(perCent) и объём(Volume) коктейлей. (через добавленные ингредиенты)
//Сделать детские, молочные коктейли.
//Создайте Bar (array[]) с напитками
//Подумайте какие поля ещё интересны (цена ect)
public class Starter {
    public static void main(String[] args) {

        Ingredient rom = new Ingredient("Rom", 50, 40);
        Ingredient cola = new Ingredient("Cola", 60);
        Cocktail romCola = new Cocktail("Rom-Cola", rom, cola);
        System.out.println("Cocktail " + romCola.getName() + " "
                + romCola.getVolume() + " ml "
                + romCola.getPerCent() + "% ");

        Ingredient vodka = new Ingredient("Vodka", 60, 40);
        Ingredient martini = new Ingredient("Martini", 10, 18);
        Cocktail vodkaMartini = new Cocktail("Vodka Martini", vodka, martini);
        vodkaMartini.setPrice(8);
        System.out.println("Cocktail " + vodkaMartini.getName() + " "
                + vodkaMartini.getVolume() + " ml "
                + vodkaMartini.getPerCent() + "% ");

        Ingredient energiser = new Ingredient("Red bull", 100);
        Cocktail disko = new Cocktail("Disco", cola, energiser);

        Ingredient milk = new Ingredient("Milk", 200);
        Ingredient bananaJuice = new Ingredient("Banana juice", 100);
        Cocktail bananaShake = new Cocktail("Banana milkshake", milk, bananaJuice);

        Ingredient strawberryJuice = new Ingredient("strawberry juice", 100);
        Cocktail strawberryShake = new Cocktail("Banana milkshake", milk, strawberryJuice);

        Ingredient soda = new Ingredient("Soda", 200);
        Ingredient appleJuice = new Ingredient("Apple juice", 100);
        Cocktail appleSpritzers = new Cocktail("Apple spritzers", soda, appleJuice);
        appleSpritzers.setPrice(4);

        Cocktail[] bar = new Cocktail[]{romCola, vodkaMartini, disko, bananaShake, strawberryShake, appleSpritzers};
        printBar(bar);
    }

    private static void printBar(Cocktail[] bar) {
        for (int i = 0; i < bar.length; i++) {
            System.out.println(bar[i]);
        }
    }
}
