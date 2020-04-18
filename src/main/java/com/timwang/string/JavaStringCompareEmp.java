package com.timwang.string;

/**
 * @ Author  : Tim Wang
 * @ FileName: JavaStringCompareEmp.java
 * @ Time    : 2020/4/15 10:53
 */
public class JavaStringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        System.out.println(str.compareTo(anotherString));
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( ((Object) str).toString().compareTo(str));
    }
}
