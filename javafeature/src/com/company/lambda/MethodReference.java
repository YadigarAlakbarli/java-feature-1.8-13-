package com.company.lambda;

interface FunctionR {

    int colculate(int a, int b);
}

public class MethodReference {

    public static void main(String[] args) {
        MethodReference mr = new MethodReference();

        //Method referance with static and non static method
        FunctionR fr1 = (int a, int b) -> (a * b);
        FunctionR fr2 = mr::colculate;
        FunctionR fr3=MethodReference::colculate2;

        //using both function for sout
        System.out.println(fr1.colculate(3,6));
        System.out.println(fr2.colculate(3, 6));
        System.out.println(fr3.colculate(31, 6));
    }

    public int colculate(int a, int b) {
        System.out.println("---------------------------");
        return (a + b);
    }

    public static int colculate2(int a, int b) {
        System.out.println("---------------------------");
        return (a - b);
    }
}
