package Vorlesung.StreamsAPI.Filter.FilterExampleExternalClassImplemntaion;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
