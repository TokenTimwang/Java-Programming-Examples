package com.timwang.swing;

import ucar.nc2.iosp.Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @ Author  : Tim Wang
 * @ FileName: UsingButton.java
 * @ Time    : 2020/5/27 14:48
 */
public class UsingButton {
    public static void main(String[] args) {
        createUsingButton();
    }

    private static void createUsingButton() {
        JFrame jFrame = new JFrame("UsingButton");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        createUI(jFrame);
    }

    private static void createUI(JFrame jFrame) {
        JPanel jPanel = new JPanel();
        LayoutManager layoutManager = new FlowLayout();
        jPanel.setLayout(layoutManager);
        JButton jButton = new JButton();
        jButton.setName("Button Test");
        jButton.setText("BUTTON Test");
        jPanel.add(jButton);

        JCheckBox jCheckBox = new JCheckBox("JCheckBox");
        jCheckBox.setEnabled(true);
        jPanel.add(jCheckBox);
        jCheckBox.setMnemonic(KeyEvent.VK_C);
        jFrame.getContentPane().add(jPanel, BorderLayout.CENTER);

        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                JOptionPane.showMessageDialog(jFrame,
                        ((JCheckBox) source).getText() + ":" + ((JCheckBox) source).isSelected());
            }
        });
    }
}
