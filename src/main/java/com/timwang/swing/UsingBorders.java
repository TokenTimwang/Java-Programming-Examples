package com.timwang.swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * @ Author  : Tim Wang
 * @ FileName: UsingBorders.java
 * @ Time    : 2020/5/27 11:37
 */
public class UsingBorders {

    public static void main(String[] args) {
        creatWindow();
    }

    private static void creatWindow() {
        JFrame jFrame = new JFrame("使用Borders");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        creatUI(jFrame);
        jFrame.setSize(500, 300);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

    private static void creatUI(JFrame jFrame) {
        Border borderline = BorderFactory.createLineBorder(Color.BLACK);
        Border raisedetched = BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.black,Color.black);
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border raisedbevel = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border loweredbevel = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        Border empty = BorderFactory.createEmptyBorder();

        JPanel jPanel = new JPanel();
        LayoutManager layoutManager = new FlowLayout();

        jPanel.setLayout(layoutManager);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JLabel("borderline"));
        jPanel1.setBorder(borderline);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("raisedetched"));
        jPanel2.setBorder(raisedetched);

        JPanel jPanel3 = new JPanel();
        jPanel3.add(new JLabel("loweredetched"));
        jPanel3.setBorder(loweredetched);

        JPanel jPanel4 = new JPanel();
        jPanel4.add(new JLabel("raisedbevel"));
        jPanel4.setBorder(raisedbevel);

        JPanel jPanel5 = new JPanel();
        jPanel5.add(new JLabel("loweredbevel"));
        jPanel5.setBorder(loweredbevel);

        JPanel jPanel6 = new JPanel();
        jPanel6.add(new JLabel("empty"));
        jPanel6.setBorder(empty);

        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        jPanel.add(jPanel3);
        jPanel.add(jPanel4);
        jPanel.add(jPanel5);
        jPanel.add(jPanel6);
        jFrame.getContentPane().add(jPanel, BorderLayout.CENTER);

    }
}
