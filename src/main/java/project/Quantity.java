package project;

public enum Quantity {
    Shampoo(500), CatFood(750), DogFood(5000), Water(10000);

    private int ml;
    Quantity(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return this.ml;
    }
}