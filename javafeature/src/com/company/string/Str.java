package com.company.string;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Str {
    public static void main(String[] args) {
        String a=" ";//1
        String b="b";//2

        System.out.println("----------------isEmpty------------------");
            System.out.println("isEmpty(1)"+a.isEmpty());
            System.out.println("isEmpty(2)"+b.isEmpty());

        System.out.println("----------------isBlank------------------");
            System.out.println("isBlank(1)"+a.isBlank());
            System.out.println("isBlank(2)"+b.isBlank());

        System.out.println("----------------lines------------------");
           String java="J\nA\nV\nA";
           System.out.println(java);
           System.out.println(java.lines().collect(Collectors.toList()));

        System.out.println("----------------strip------------------");
            String s="  Lorem Ipesum  ";
            System.out.println("s.length()"+s.length());
            System.out.println("s.strip()"+s.strip().length());
            System.out.println("s.trim()"+s.trim().length());

        System.out.println("----------------repeat------------------");
            String repeat="Java ";
            System.out.println(repeat.repeat(3));

        System.out.println("----------------indent------------------");
            String indent="Java ";
            System.out.println(repeat.indent(3));

        System.out.println("----------------transform------------------");
           Function f= (c)->c+" Feature";
           String transform= (String) "Java".transform(f);
           System.out.println(transform);


    }
}
