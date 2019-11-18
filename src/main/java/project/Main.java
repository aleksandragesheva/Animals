package project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double salary = Double.parseDouble(scanner.nextLine());
            String catName = scanner.nextLine();
            String dogName = scanner.nextLine();
            double catKilos = Double.parseDouble(scanner.nextLine());
            double dogKilos = Double.parseDouble(scanner.nextLine());

            Family family = new FamilyImpl(salary);
            Animal cat = new Cat(catName, catKilos);
            Animal dog = new Dog(dogName, dogKilos);

            family.add(cat);
            family.add(dog);

            System.out.println(family.toString());
            System.out.println();

            System.out.println("The rest of all the products for the next month:");
            System.out.println(cat.toString());
            System.out.println();
            System.out.println(dog.toString())


        }catch (IllegalArgumentException | NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }
}

