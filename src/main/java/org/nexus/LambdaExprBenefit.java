package org.nexus;

interface Processor {
    String process(String str);
}

/**
 * This class demonstrates the code conciseness allowed by Lambda expressions.
 */
public class LambdaExprBenefit {

    public static void main(String[] args) {
        String input = "Hello World";
//        anonymousClassVerbose(input);
        conciseLambdaEquivAnonymousClass(input);
    }

    /**
     * Say we want to just upper case a string. Using anonymous class implementation, that would be long task
     */
    public static void anonymousClassVerbose(String input) {
        Processor processor = new Processor() {
            public String process(String str) {
                return str.toLowerCase();
            }
        };
        process(input, processor);
    }

    public static void conciseLambdaEquivAnonymousClass(String input) {
        process(input, str -> str.toUpperCase());
    }

    public static void process(String input, Processor processor) {
        System.out.println(processor.process(input));
    }
}
