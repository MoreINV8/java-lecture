package Interface_I;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CustomCompare> arrayList = new ArrayList<>();
        Product[] products = new Product[3];

        products[0] = new Product("test01", 10.0);
        arrayList.add(products[0]);
        products[1] = new Product("test02", 50.0);
        arrayList.add(products[1]);
        products[2] = new Product("test03", 5);
        arrayList.add(products[2]);

        System.out.println("Product");
        System.out.println(Data.min(arrayList));
        System.out.println("----------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        Data.sort(products);
        System.out.println("----------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        System.out.println("----------------------");
        System.out.println("----------------------");

        arrayList.clear();
        Car[] cars = new Car[3];

        cars[0] = new Car("test01", 250);
        arrayList.add(cars[0]);
        cars[1] = new Car("test02", 300);
        arrayList.add(cars[1]);
        cars[2] = new Car("test03", 40);
        arrayList.add(cars[2]);

        System.out.println("Car");
        System.out.println(Data.min(arrayList));
        System.out.println("----------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        Data.sort(cars);
        System.out.println("----------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("----------------------");
    }
}

// ไชยภัทร ศรีอำไพ 6510450305

