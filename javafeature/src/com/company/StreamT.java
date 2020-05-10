package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamT {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            l.add(i);
        }
        //filter
        Stream<Integer> great=l.stream().filter((n)->n>50);
        //print great number list
        great.forEach((n)-> System.out.println(n));
        //or
        //great.forEach(System.out::println);
        //or
        Consumer<Integer>consumer=(c)-> System.out.println(c);
        //great.forEach(consumer);
        //map
        Stream<Integer> less=l.stream().filter((n)->n<0);
        less.map(n->n*n).forEach(System.out::println);

        //limit
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //sorted
        random.ints().limit(10).sorted().forEach(System.out::println);

    }
}
