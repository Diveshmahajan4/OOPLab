package GUI;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    public Layout() {
        setTitle("Layout");
        setSize(400 ,400);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        JButton b1 = new JButton("Hello");
        b1.setBounds(20 ,20, 80 ,30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.red);

        JButton b2 = new JButton("Hello");
        b2.setBounds(110 ,20, 80 ,30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.blue);

        JButton b3 = new JButton("Hello");
        b3.setBounds(200 ,20, 80 ,30);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.orange);

        JButton b4 = new JButton("Hello");
        b4.setBounds(290 ,20, 80 ,30);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.green);

        JButton b5 = new JButton("Hello");
        b5.setBounds(160 ,70, 80 ,30);
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.yellow);

        JButton b6 = new JButton("Hello");
        b6.setBounds(20 ,90, 80 ,30);
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.blue);

        JButton b7 = new JButton("Hello");
        b7.setBounds(110 ,140, 80 ,30);
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.gray);

        JButton b8 = new JButton("Hello");
        b8.setBounds(200 ,190, 80 ,30);
        b8.setBackground(Color.WHITE);
        b8.setForeground(Color.cyan);

        JButton b9 = new JButton("Hello");
        b9.setBounds(290 ,240, 80 ,30);
        b9.setBackground(Color.WHITE);
        b9.setForeground(Color.pink);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
    }

    public static void main(String[] args) {
        Layout l = new Layout();
        l.setVisible(true);
    }
}
