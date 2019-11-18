package project;

public class Dog extends AnimalImpl{

    private static final double PERCENT_PER_BODY = 60;
    public Dog(String name, double kilos) {
        super(name,kilos);
        super.setDefaultPercentPerBody(PERCENT_PER_BODY);
    }

    @Override
    public double getDrinkExpenses() {
        return super.getDrinkExpenses();
    }

    @Override
    public double getRestOfWaterMilliliters() {
        return super.getRestOfWaterMilliliters();
    }

    @Override
    public double takeBathCost() {
        double price = Prices.DOG_SHAMPOO.getValue();

        int mililiters = 0;
        int cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {
                mililiters += Quantity.SHAMPOO.getMl();
                cost += price;
            }
            if (i % 10 == 0) {
                if (mililiters - 200 >= 0) {
                    mililiters -= 200;

                } else {
                    mililiters += 300;
                    cost += price;
                }
            }
        }

        return cost;
    }

    @Override
    public double getFoodExpenses() {
        double price = Prices.DOG_FOOD.getValue();
        int grams = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {
                grams += Quantity.DOG_FOOD.getMl();
                cost += price;
            }

            if (grams - 500 >= 0) {
                grams -= 500;

            } else {
                cost += price;
                grams += 4500;
            }

        }
        return cost;
    }

    @Override
    public double takeRestOfShampooMilliliters() {
        double price = Prices.DOG_SHAMPOO.getValue();

        int mililiters = 0;
        int cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {
                mililiters += Quantity.SHAMPOO.getMl();
                cost += price;
            }
            if (i % 10 == 0) {
                if (mililiters - 200 >= 0) {
                    mililiters -= 200;

                } else {
                    mililiters += 300;
                    cost += price;
                }
            }
        }

        return mililiters;
    }

    @Override
    public double takeRestOfFoodGrams() {
        double price = Prices.DOG_FOOD.getValue();
        int grams = 0;
        double cost = 0;

        for (int i = 0; i < 30; i++) {

            if (i % 30 == 0) {
                grams += Quantity.DOG_FOOD.getMl();
                cost += price;
            }

            if (grams - 500 >= 0) {
                grams -= 500;

            } else {
                cost += price;
                grams += 4500;
            }

        }
        return grams;
    }
}
