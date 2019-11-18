package project;

public class Cat extends AnimalImpl {

    public Cat(String name, double kilos) {
        super(name, kilos);
    }

    @Override
    public double getDrinkExpenses() {
        return super.getDrinkExpenses();
    }

    @Override
    public double takeBathCost() {

        double price = Prices.CatShampoo.getValue();

        int mililiters = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {
                mililiters += Quantity.Shampoo.getMl();
                cost += price;
            }
            if (i % 10 == 0) {
                if (mililiters - 100 >= 0) {
                    mililiters -= 100;

                } else {
                    mililiters += 400;
                    cost += price;
                }
            }
        }
        return cost;
    }



    @Override
    public double getFoodExpenses() {

        double price = Prices.CatFood.getValue();
        int grams = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {

                grams += Quantity.CatFood.getMl();
                cost += price;
            }

            if (grams - 200 >= 0) {
                grams -= 200;

            } else {
                grams += 550;
                cost += price;
            }

        }
        return cost;
    }

    @Override
    public double takeRestOfShampooMilliliters() {

        double price = Prices.CatShampoo.getValue();

        int mililiters = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {
            if (i % 30 == 0) {
                mililiters += Quantity.Shampoo.getMl();
                cost += price;
            }
            if (i % 10 == 0) {
                if (mililiters - 100 >= 0) {
                    mililiters -= 100;

                } else {
                    mililiters += 400;
                    cost += price;
                }
            }
        }
        return mililiters;
    }

    @Override
    public double takeRestOfFoodGrams() {

        double price = Prices.CatFood.getValue();
        int grams = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {

                grams += Quantity.CatFood.getMl();
                cost += price;
            }

            if (grams - 200 >= 0) {
                grams -= 200;

            } else {
                grams += 550;
                cost += price;
            }

        }
        return grams;
    }

}

