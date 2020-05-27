package com.timwang.swing;

import ucar.nc2.iosp.Layout;

import javax.swing.*;
import java.awt.*;

/**
 * @ Author  : Tim Wang
 * @ FileName: UsingSelectFile.java
 * @ Time    : 2020/5/27 15:27
 */
public class UsingSelectFile {

    public static void main(String[] args) {
        createFileSelect();
    }

    private static void createFileSelect() {
        JFrame jFrame = new JFrame("createFileSelect");
        jFrame.setSize(500, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        createSelectFileUI(jFrame);

    }

    private static void createSelectFileUI(JFrame jFrame) {
        JPanel jPanel = new JPanel();
        LayoutManager layoutManager = new FlowLayout();
        jPanel.setLayout(layoutManager);
        JButton jo = new JButton();
        jo.setText("BUTTON Test");
        jPanel.add(jo);
        jFrame.getContentPane().add(jPanel, BorderLayout.CENTER);
    }
}
