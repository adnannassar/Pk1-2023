package Vorlesung.StreamsAPI;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        double array []  =  {1,2,3,4};
        System.out.println(Arrays.stream(array).reduce(Double::sum).getAsDouble());
    }
}
