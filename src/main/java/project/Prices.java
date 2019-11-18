package project;

public enum Prices {
    DogShampoo(5.0), CatShampoo(3.5), DogFood(15), CatFood(13)
    ,Water(5);

    private double value;
    Prices(double value) {
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }
}
