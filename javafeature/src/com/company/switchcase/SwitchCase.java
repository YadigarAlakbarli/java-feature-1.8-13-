package com.company.switchcase;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println(findType(0));
        System.out.println(findType(1));
        System.out.println(findType(2));
        System.out.println(findType(11));
    }


    private static String findType(int x){
        final String numericString =
                switch (x) {
                            case 0 -> "zero";
                            case 1, 3, 5, 7, 9 -> "odd";
                            case 2, 4, 6, 8, 10 -> "even";
                            default -> "N/A";
                        };

        return numericString;
    }
}
