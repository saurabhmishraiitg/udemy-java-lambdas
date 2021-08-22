package org.nexus;

import java.util.function.DoubleSupplier;
import java.util.function.Function;

/**
 * Example of JDK8 inbuilt functional interfaces
 */
public class InbuiltFunctionalInterfaces {

    public static void main(String[] args) {
        String input = "Udemy Course";
//        inBuiltFunction(input);
        doubleSupplier(() -> 2);
    }

    public static void inBuiltFunction(String input) {
        process(input, str -> str.toUpperCase());
    }

    public static void process(String input, Function<String, String> processor) {
        System.out.println(processor.apply(input));
    }

    public static void doubleSupplier(DoubleSupplier supplier) {
        System.out.println(supplier.getAsDouble());
    }

}
