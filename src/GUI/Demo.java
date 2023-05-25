package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo extends JFrame {

    public Demo() {
        super("JButton Clicked Counter");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a JPanel and four buttons
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("west");

        // Add buttons to the JPanel
        buttonPanel.add(northButton, BorderLayout.NORTH);
        buttonPanel.add(southButton, BorderLayout.SOUTH);
        buttonPanel.add(eastButton, BorderLayout.EAST);
        buttonPanel.add(westButton, BorderLayout.WEST);

        add(buttonPanel, BorderLayout.SOUTH);
    }/*from w w  w  .java2s. c  o m*/

    public static void main(String[] args) {
        Demo frame = new Demo();
        frame.pack();
        frame.setVisible(true);
    }
}
