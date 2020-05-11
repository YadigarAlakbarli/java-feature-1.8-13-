package com.company.var;


import java.time.LocalDate;
import java.util.ArrayList;

public class Variable {
    /*cannot use var to declare member variables inside the class,
     formal parameters, or to return the type of methods.
       public var a=10;--not allow here
     */


    public static void main(String[] args) {
        //var n;---not allow without initialize
        //var n=null;var variable initializer is con't 'null

        var referance = LocalDate.now();

        var obj = new Object() {};
       // obj = new Object(); // error: Object cannot be converted to <anonymous Object>

    }


}
