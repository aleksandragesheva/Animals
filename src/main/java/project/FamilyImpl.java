package project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FamilyImpl implements Family {

    private double salary;
    private List<Animal> pets;

    public FamilyImpl(double salary) {
        this.setSalary(salary);
        this.pets = new ArrayList<>();
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(double salary) {
        if(salary <= 0){
            throw new IllegalArgumentException("" +
                    "Salary can't be 0 or less than 0!"
            );
        }
        this.salary = salary;
    }

    @Override
    public void add(Animal animal){
        this.pets.add(animal);
    }

    @Override
    public double getAnimalExpenses(){
        double cost = 0;

        for (Animal pet : this.pets) {
            cost += pet.getDrinkExpenses();
            cost += pet.getFoodExpenses();
            cost += pet.takeBathCost();
        }

        return cost;
    }

    @Override
    public double getTotalRestOfWaterOfAllAnimals(){

        DecimalFormat df = new DecimalFormat("#.00");
        double ml = 0;

        for (Animal pet : this.pets) {
            ml += pet.getRestOfWaterMilliliters();
        }

        BigDecimal bg = new BigDecimal(ml).setScale(2, RoundingMode.HALF_DOWN);
        double newMl = bg.doubleValue();

        return newMl;
    }

    @Override
    public double getRestOfSalary(){
        return this.salary - this.getAnimalExpenses();
    }

    public int count(){
        return this.pets.size();
    }

    @Override
    public String toString() {
        return String.format("You have %.2f lv. expenses for your pets." +
                        System.lineSeparator() +
                        "The rest of your salary is: %.2f lv.",
                this.getAnimalExpenses(), this.getRestOfSalary());
    }
}
