package org.nexus;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Learning about method reference
 * (String::toLowerCase) == (str -> str.toLowerCase())
 * (String::substring) == ((str,i) -> str.substring(i))
 * (String::valueOf) == (n -> String.valueOf(n))
 * (String::new) == (str -> new String(str))
 * (randstr::concat) == (otherstring -> randstring.concat(otherstring))
 */
public class MethodReference {

    public static void main(String[] args) {
        String input = "Method Reference";
//        methodReferenceCase(input);
//        methodReferenceSubstring(input);
//        methodReferenceStatic(1);
//        methodReferenceNew(input);
        methodReferenceInstance(input);
    }

    /*
    (String::toLowerCase) == (str -> str.toLowerCase())
     */
    public static void methodReferenceCase(String input) {
        processFunction(input, String::toLowerCase);
    }

    /*
    (String::substring) == ((str,i) -> str.substring(i))
     */
    public static void methodReferenceSubstring(String input) {
        int offset = 2;
        processBiFunction(input, offset, String::substring);
    }

    public static void processFunction(String input, Function<String, String> func) {
        System.out.println(func.apply(input));
    }

    public static void processBiFunction(String input, int offset, BiFunction<String, Integer, String> bifunc) {
        System.out.println(bifunc.apply(input, offset));
    }

    /*
    (String::valueOf) == (n -> String.valueOf(n))
     */
    public static void methodReferenceStatic(String input) {
        processFunction(input, String::valueOf);
    }

    /*
    (String::new) == (str -> new String(str))
     */
    public static void methodReferenceNew(String input) {
        processFunction(input, String::new);
    }

    /*
    (randstr::concat) == (otherstring -> randstring.concat(otherstring))
     */
    public static void methodReferenceInstance(String input) {
        String prefix = "here ";
        processFunction(input, prefix::concat);
    }
}
