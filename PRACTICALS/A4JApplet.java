// Using JApplet creates two buttons, named as Green and Blue. If Green button is pressed then background color will turn into Green color. If Blue button is pressed then background color will turn into Blue color.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A4JApplet extends JFrame {
    public A4JApplet() {
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        greenButton.addActionListener(e -> getContentPane().setBackground(Color.GREEN));
        blueButton.addActionListener(e -> getContentPane().setBackground(Color.BLUE));

        add(greenButton);
        add(blueButton);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A4JApplet();
    }
}