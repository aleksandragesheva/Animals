package project;

import project.Animal;

public abstract class AnimalImpl implements Animal {
    private static final int days = 30;
    private static final double percentPerBody = 0.03;

    private String name;
    private double kilos;
    private double defaultPercentPerBody;

    public AnimalImpl(String name, double kilos) {
        this.setName(name);
        this.setKilos(kilos);
        this.setDefaultPercentPerBody(percentPerBody);

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getKilos() {
        return this.kilos;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()
                || name.length() < 3) {
            throw new NullPointerException(
                    String.format("The name of the %s can't be null, whitespace or less than 3 letters!",
                            this.getClass().getSimpleName())
            );

        }

        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)){
                throw new IllegalArgumentException(
                        String.format("The name of the %s can't contain digits!",
                                this.getClass().getSimpleName())
                );
            }
        }
        this.name = name;
    }

    public void setKilos(double kilos) {
        if(kilos <= 0 ){
            throw new IllegalArgumentException(
                    String.format("The Kilos of the %s cant't be 0 or less than 0",
                            this.getClass().getSimpleName())
            );
        }
        this.kilos = kilos;
    }

    public void setDefaultPercentPerBody(double defaultPercentPerBody) {
        this.defaultPercentPerBody = defaultPercentPerBody;
    }

    @Override
    public double getDrinkExpenses() {
        double price = Prices.Water.getValue();
        double ml = 0;
        double quantityWater = this.defaultPercentPerBody * this.kilos;
        double cost = 0;

        for (int day = 0; day < days; day++) {

            if (day % 30 == 0) {
                ml += Quantity.Water.getMl();
                cost += price;
            }

            if (ml - quantityWater >= 0) {
                ml -= quantityWater;

            } else {

                ml += (Quantity.Water.getMl() - quantityWater);
                cost += price;
            }

        }
        return cost;
    }

    @Override
    public double getRestOfWaterMilliliters() {
        double price = Prices.Water.getValue();
        double ml = 0;
        double quantityWater = this.defaultPercentPerBody * this.kilos;
        double cost = 0;

        for (int day = 0; day < days; day++) {

            if (day % 30 == 0) {
                ml += Quantity.Water.getMl();
                cost += price;
            }

            if (ml - quantityWater >= 0) {
                ml -= quantityWater;

            } else {

                ml += (Quantity.Water.getMl() - quantityWater);
                cost += price;
            }

        }
        return ml;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                        "- Rest of shampoo ml.: %.2f" + System.lineSeparator() +
                        "- Rest of food grams: %.2f" + System.lineSeparator() +
                        "- Rest of water ml.: %.2f",
                this.getClass().getSimpleName(),
                this.takeRestOfShampooMilliliters(),
                this.takeRestOfFoodGrams(),
                this.getRestOfWaterMilliliters());
    }
}

