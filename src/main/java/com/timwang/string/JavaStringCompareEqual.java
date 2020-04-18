package com.timwang.string;

/**
 * @ Author  : Tim Wang
 * @ FileName: JavaStringCompareEqual.java
 * @ Time    : 2020/4/17 22:13
 */
public class JavaStringCompareEqual {
    public static void main(String[] args) {
        String s1 = "tutorialspoint";
        String s2 = "tutorialspoint";
        String s3 = new String ("Tutorials Point");
        System.out.println(true);
        System.out.println(s2.equals(s3));
    }
}
