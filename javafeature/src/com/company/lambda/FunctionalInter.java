package com.company.lambda;

@FunctionalInterface
interface Function{
    //functional interface should be only one abstract method
    int calculate(int a,int b);

    //can be have static and private method

    static String foo(){
        return "Foo";
    }

    private String foo2(){
        return "FOO-2";
    }
}
public class FunctionalInter {

    static Function f1=(x,y)-> x*y;
    static Function f2=(x,y)-> x+y;

    public static void main(String[] args) {
        System.out.println(f1.calculate(2,3));
        System.out.println(f2.calculate(2,3));
    }
}
