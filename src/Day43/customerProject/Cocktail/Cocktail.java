package Day43.customerProject.Cocktail;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredient;
    private double volume;
    private double price;
    private String category;
    private double perCent;


    public Cocktail(String name, Ingredient... ingredient) {
        this.name = name;
        this.ingredient = ingredient;
        setVolume(this.ingredient);
        setPerCent(this.ingredient);
        setCategory();

    }

    public void setPrice(double price) {
        this.price = price;
    }

    private void setCategory() {
        //детские
        //безалкогольные
        //слабоалкогольные (9-14%);
        //средне алкогольны (16-25%);
        //крепко алкогольные (свыше 35%).
        if (this.perCent > 34) this.category = "strongly alcoholic";
        else if (this.perCent > 15 && this.perCent < 26) this.category = "average alcoholic beverage";
        else if (this.perCent > 8 && this.perCent < 16) this.category = "low-alcoholic beverage";
        else if (this.perCent < 9) this.category = "soft drink";
        else if (this.perCent == 0) this.category = "children's cocktails";

    }

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    private void setVolume(Ingredient... ingredients) {
        for (Ingredient element : ingredients) {
            volume += element.getLiquid();
        }
        this.volume = volume;
    }

    private void setPerCent(Ingredient... ingredients) {
        perCent = 0;
        for (Ingredient element : ingredients) {
            perCent += (element.getLiquid() * element.getPerCent()) / 100;
        }
        this.perCent = perCent;
    }

    public double getPerCent() {
        return perCent;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ",  " + perCent + "%" +
                ", price=" + price +
                ", category=" + category +
                "  ingredient=" + Arrays.toString(ingredient) +
                '}';
    }
}

