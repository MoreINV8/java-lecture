package Interface_II;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("test01", 10.0);
        products[1] = new Product("test03", 50.0);
        products[2] = new Product("test02", 5);

        System.out.println("Product");
        System.out.println(Data.min(products, new ComparePrice()));
        System.out.println("----------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName());
        }

        Data.sort(products, new NameComparator());
        System.out.println("----------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName());
        }

        Data.sort(products, new PriceComparator());
        System.out.println("----------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getPrice());
        }

        System.out.println("----------------------");
        System.out.println("----------------------");

        Car[] cars = new Car[3];

        cars[0] = new Car("test01", 250);
        cars[1] = new Car("test03", 300);
        cars[2] = new Car("test02", 40);

        System.out.println("Car");
        System.out.println(Data.min(cars, new CompareKiloDriven()));
        System.out.println("----------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getLicense());
        }

        Data.sort(cars, new LicenseComparator());
        System.out.println("----------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getLicense());
        }

        Data.sort(cars, new KiloDrivenComparator());
        System.out.println("----------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getKiloDriven());
        }
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
