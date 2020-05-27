package com.timwang.swing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ Author  : Tim Wang
 * @ FileName: UsingTester.java
 * @ Time    : 2020/5/27 23:15
 */
public class UsingTester implements Serializable {
    public String name;
    public String sex;

    UsingTester(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {
        UsingTester usingTester = new UsingTester("展示", "数据");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\TimwangStudy\\person.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(usingTester);
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行过程出现异常~！！");
        }

    }
}
