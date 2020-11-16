package Day43.customerProject.Cocktail;

public class Ingredient {

    private String name;
    private boolean alcohol;
    private int liquid;
    private int perCent;


    public Ingredient(String name, int liquid) {
        this.name = name;
        this.liquid = liquid;
    }

    public Ingredient(String name, int liquid, int perCent) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = perCent;
    }

    public int getLiquid() {
        return liquid;
    }

    public int getPerCent() {
        return perCent;
    }

    @Override
    public String toString() {
        return "\nname='" + name + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }
}
