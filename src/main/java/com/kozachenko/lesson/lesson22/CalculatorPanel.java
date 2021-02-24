package com.kozachenko.lesson.lesson22;

import com.kozachenko.lesson.lesson5.Operation;
import com.kozachenko.lesson.lesson5.OperationFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {


    JTextField textField = new JTextField("Input Text");
    JButton resultButton = new JButton("=");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton dotButton = new JButton(".");
    JButton sumButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton divideButton = new JButton("/");
    JButton multiplyButton = new JButton("*");
    JPanel buttonPanel = new JPanel(new GridLayout(4,4));

    public void init(){
        initButtonPanel();
        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void initButtonPanel() {
        initButtonsActions();
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(divideButton);
        buttonPanel.add(button6);
        buttonPanel.add(button5);
        buttonPanel.add(button4);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(button3);
        buttonPanel.add(button2);
        buttonPanel.add(button1);
        buttonPanel.add(sumButton);
        buttonPanel.add(button0);
        buttonPanel.add(dotButton);
        buttonPanel.add(resultButton);
        buttonPanel.add(minusButton);
    }

    private void initButtonsActions() {
        button0.addActionListener(e -> {
            textField.setText(textField.getText() + "0");
        });
        button1.addActionListener(e -> {
            textField.setText(textField.getText() +"1");
        });
        button2.addActionListener(e -> {
            textField.setText(textField.getText() +"2");
        });
        button3.addActionListener(e -> {
            textField.setText(textField.getText() +"3");
        });
        button4.addActionListener(e -> {
            textField.setText(textField.getText() +"4");
        });
        button5.addActionListener(e -> {
            textField.setText(textField.getText() +"5");
        });
        button6.addActionListener(e -> {
            textField.setText(textField.getText() +"6");
        });
        button7.addActionListener(e -> {
            textField.setText(textField.getText() +"7");
        });
        button8.addActionListener(e -> {
            textField.setText(textField.getText() +"8");
        });
        button9.addActionListener(e -> {
            textField.setText(textField.getText() +"9");
        });
        sumButton.addActionListener(e -> {
            textField.setText(textField.getText() +"+");
        });
        minusButton.addActionListener(e -> {
            textField.setText(textField.getText() +"-");
        });
        divideButton.addActionListener(e -> {
            textField.setText(textField.getText() +"/");
        });
        multiplyButton.addActionListener(e -> {
            textField.setText(textField.getText() +"*");
        });
        initResultButton();
        dotButton.addActionListener(e -> {
            textField.setText(textField.getText() +".");
        });
    }

    private void initResultButton() {
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String math = textField.getText();

                if(math.contains("+")){
                    String numbers [] = math.split("[+]");
                    int firstNum = Integer.parseInt(numbers[0]);
                    int secondNum = Integer.parseInt(numbers[1]);
                    int result = firstNum + secondNum;
                    textField.setText(String.valueOf(result));
                }
            }
        });
    }

    public CalculatorPanel() {
        init();
    }
}
