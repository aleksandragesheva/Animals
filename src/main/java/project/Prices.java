package project;

public enum Prices {
    DOG_SHAMPOO(5.0), CAT_SHAMPOO(3.5), DOG_FOOD(15), CAT_FOOD(13)
    , WATER(5);

    private double value;
    Prices(double value) {
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }
}
