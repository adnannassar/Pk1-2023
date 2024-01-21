package Vorlesung.StreamsAPI.Filter.FilterExampleExternalClassImplemntaion;

import java.util.function.Predicate;

class MyFilter implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.toLowerCase().startsWith("b");
    }
}
