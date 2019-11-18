package project;

public enum Quantity {
    SHAMPOO(500), CAT_FOOD(750), DOG_FOOD(5000), WATER(10000);

    private int ml;
    Quantity(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return this.ml;
    }
}