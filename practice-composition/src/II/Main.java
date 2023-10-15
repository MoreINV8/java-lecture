package II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inputStream);

        Store appliance = new Store("Sam's Small Appliances",
                "100 Main Street \nAnytown, CA 98765 ");

        appliance.addProduct("Toaster", 29.95);
        appliance.addProduct("Hair_dryer", 24.95);
        appliance.addProduct("Car_vacuum", 19.99);

        System.out.println("Welcome to " + appliance.getStoreName());
        System.out.println("to quit ordering type \"exit\"");
        System.out.println("--------------------------");

        String input;
        try {
            while (!(input = readLine()).equalsIgnoreCase("exit")) {
                try {
                    String productName = input.split(" ")[0];
                    int quantity = Integer.parseInt(input.split(" ")[1]);

                    appliance.purchase(productName, quantity);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.err.println("Input wrong format...");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        appliance.billing();
    }

    private static String readLine() throws IOException {
        System.out.print("What do you want? (product_name quantity)");
        String input = bufferedReader.readLine();
        System.out.println("--------------------------");
        return input;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
