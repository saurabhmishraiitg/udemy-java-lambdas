package org.nexus;

import java.util.function.Function;

/**
 * Work on scoping in lambda expressions.
 */
public class ScopeLambdaExpr {

    public static void main(String[] args) {
        String input = "Scope Me";
        scopingLambda(input);
    }

    public static void scopingLambda(String input) {
        // Variables defined in enclosing the lamda expression need to be final or effectively final
        final String prefix = "Hi ";
        process(input, str -> {
            return prefix.concat(str);
        });
    }

    public static void process(String input, Function<String, String> func) {
        System.out.println(func.apply(input));
    }

}
