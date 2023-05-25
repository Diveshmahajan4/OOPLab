package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public Calculator(){
        setTitle("Calculator");
        setSize(400, 400);
        JPanel panel = new JPanel();;
        getContentPane().add(panel);
        panel.setLayout(null);

        JTextField txt = new JTextField();
        txt.setBounds(20 ,10 ,360, 30);

        // ROW 1
        JButton b1 = new JButton("1");
        b1.setBounds(20 ,50, 80 ,30);

        JButton b2 = new JButton("2");
        b2.setBounds(110 ,50, 80 ,30);

        JButton b3 = new JButton("3");
        b3.setBounds(200 ,50, 80 ,30);

        JButton b4 = new JButton("+");
        b4.setBounds(290 ,50, 80 ,30);

        // Row 2
        JButton b5 = new JButton("4");
        b5.setBounds(20 ,90, 80 ,30);

        JButton b6 = new JButton("5");
        b6.setBounds(110 ,90, 80 ,30);

        JButton b7 = new JButton("6");
        b7.setBounds(200 ,90, 80 ,30);

        JButton b8 = new JButton("-");
        b8.setBounds(290 ,90, 80 ,30);

        // Row 3
        JButton b9 = new JButton("7");
        b9.setBounds(20 ,130, 80 ,30);

        JButton b10 = new JButton("8");
        b10.setBounds(110 ,130, 80 ,30);

        JButton b11 = new JButton("9");
        b11.setBounds(200 ,130, 80 ,30);

        JButton b12 = new JButton("x");
        b12.setBounds(290 ,130, 80 ,30);

        // ROW 4
        JButton b13 = new JButton("0");
        b13.setBounds(20 ,170, 80 ,30);

        JButton b14 = new JButton("Cancel");
        b14.setBounds(110 ,170, 80 ,30);
        b14.setBackground(Color.WHITE);
        b14.setForeground(Color.blue);

        JButton b15 = new JButton("Ans");
        b15.setBounds(200 ,170, 80 ,30);
        b15.setBackground(Color.WHITE);
        b15.setForeground(Color.orange);

        JButton b16 = new JButton("/");
        b16.setBounds(290 ,170, 80 ,30);

//        b1.addActionListener(this);



        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        panel.add(txt);

    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setVisible(true);
    }
}
