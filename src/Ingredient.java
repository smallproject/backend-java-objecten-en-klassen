public class Ingredient {
    private double amount;
    private String name;
    private String unit;

    public Ingredient(){}

    public Ingredient(String name, int amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


}
