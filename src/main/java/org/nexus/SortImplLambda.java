package org.nexus;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implementation of sorting in Lambda Expressions
 */
public class SortImplLambda {

    public static void main(String[] args) {
        String[] strArr = {"Mr Saurabh", "Mr Naruto", "Master Luffy", "Ms Sakura"};

        System.out.println(Arrays.toString(strArr));
        /*
        3 different ways to implement the custom sorting logic.
         */
        Arrays.sort(strArr, (x, y) -> -1 * x.split(" ")[1].compareTo(y.split(" ")[1]));

        // Helper method
//        Arrays.sort(strArr, Comparator.comparing(x -> x.split(" ")[1]));

        // Helper method with method references
//        Arrays.sort(strArr, Comparator.comparing(SortImplLambda::firstName));

        System.out.println(Arrays.toString(strArr));
    }

    public static String firstName(String name) {
        return name.split(" ")[1];
    }
}
