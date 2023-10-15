package store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        System.out.println(store.count(new AllProductCounter()));
        System.out.println(store.count(new ProductInStockCounter()));
        System.out.println(store.count(new ProductQuantityCounter()));
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
