import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Promotion[] promotions = {
//                new CouponPromotion(150),
//                new CouponPromotion(50),
//                new PercentPromotion(),
//                new ConditionPromotion()
//        };
//
//        Calculator calculator = new Calculator(5000);
//        calculator.discount(promotions);
//
//        System.out.println(calculator.getTotal());


//        try {
//            FileWriter f = new FileWriter("output.txt");
//            BufferedWriter buffer = new BufferedWriter(f);
//
//            buffer.write("Hello\n");
//            buffer.flush();
//        } catch (IOException e) {
//            System.err.println(e);
//        }

//        HashSet<String> list = new HashSet<>();
//        list.add("HI");
//        list.add("H0");
//
//        for (String value : list) {
//            System.out.println(value);
//        }

        Tank tank1 = new Tank(50);
        Tank tank2 = new Tank(200);
        Tank tank3 = new Tank(300);
        Tank[]tanks = {tank1, tank2, tank3};

        System.out.println(min(tanks));

    }

    private static double min(CustomComparable[] objects) {
        CustomComparable less = objects[0];
        for (CustomComparable t : objects) {
            if (less.compareTo(t) > 0) {
                less = t;
            }
        }
        return  less.getData();
    }
}