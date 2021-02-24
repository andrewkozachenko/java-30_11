package com.kozachenko.lesson.lesson22;


import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private JPanel mainPanel = new CalculatorPanel();


    public Calculator() throws HeadlessException {
        Dimension dimension = new Dimension(500, 500);
        setBackground(Color.darkGray);
        setSize(dimension);
        setTitle("Calculator");

        add(mainPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
        pack();

    }

//    mainPanel = new JPanel();
//        secondPanel = new JPanel();
//        textField = new JTextField("This is text field");
//        exit = new JButton("Exit");
//        exit.addActionListener(e -> System.exit(0));
//        secondPanel.setPreferredSize(dimension);
//        secondPanel.add(textField);
//        secondPanel.add(exit);
//        secondPanel.setBackground(Color.RED);
//        next = new JButton("Show next Panel");
//        JFrame thisFrame = this;
//        next.addActionListener(e -> {
//            thisFrame.getContentPane().removeAll();
//            thisFrame.getContentPane().invalidate();
//            this.getContentPane().revalidate();
//            thisFrame.getContentPane().add(secondPanel);
//            thisFrame.getContentPane().repaint();
//        });
//        mainPanel.add(next);
//        mainPanel.setPreferredSize(dimension);
}
