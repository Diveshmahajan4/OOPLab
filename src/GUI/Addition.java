package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends JFrame {
    public Addition(){
        setTitle("Addition");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        JLabel l1 = new JLabel("First Number :");
        l1.setBounds(20, 20, 180, 30);
        JLabel l2 = new JLabel("Second Number :");
        l2.setBounds(20, 70, 180, 30);
        JLabel l3 = new JLabel("Result");
        l3.setBounds(20, 120, 180, 30);
        JTextField txt1 = new JTextField();
        txt1.setBounds(180, 20, 200, 30);
        JTextField txt2 = new JTextField();
        txt2.setBounds(180, 70, 200, 30);
        JTextField txt3 = new JTextField();
        txt3.setBounds(180, 120, 200, 30);

        JButton add = new JButton("ADD");
        add.setBounds(180, 170, 80, 40);
        JButton clear = new JButton("CLEAR");
        clear.setBounds(265, 170, 80, 40);

        JButton exit = new JButton("EXIT");
        exit.setBounds(310, 310, 70, 40);

        // Addition Action Listener
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a1 = Integer.parseInt(txt1.getText());
                int a2 = Integer.parseInt(txt2.getText());
                int a3 = a1 + a2;
                txt3.setText(String.valueOf(a3));
            }
        });

        // Clear Action Listener
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });

        // Exit
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(txt1);
        panel.add(txt2);
        panel.add(txt3);
        panel.add(add);
        panel.add(clear);
        panel.add(exit);
    }

    public static void main(String[] args) {
        Addition add = new Addition();
        add.setVisible(true);
    }
}
