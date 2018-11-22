package lec06exception;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private ATM atm;

    private JFrame frame;
    private JButton button;

    public GUI() {
        atm = new ATM();
        frame = new JFrame();
        frame.setSize(200, 200);
        button = new JButton("Transfer");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        addListener();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addListener() {

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                BankAccount source = new BankAccount(100);
                BankAccount destination = new BankAccount(200);

                // -----------------------------------------------
                // this is a GUI class and know how to tell a user
                // what is wrong.
                // therefore, it tries and catches exception
                // and show appropriate message to user
                // -----------------------------------------------
                try {

                    atm.transfer(source, destination, 1000);

                } catch (InsufficientFundException e) {

                    JOptionPane.showMessageDialog(frame,
                            e.getMessage(),
                            "ATM Error",
                            JOptionPane.ERROR_MESSAGE);

                }
            }
        });

    }
}
