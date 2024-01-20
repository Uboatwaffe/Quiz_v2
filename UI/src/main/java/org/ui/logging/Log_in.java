package org.ui.logging;

import javax.swing.*;

/**
 * Created on 20.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Log_in extends JFrame {

    private JPanel panel;
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;
    private JButton signUpButton;
    private JButton closeButton;
    private JLabel welcome;
    private JLabel username;
    private JLabel password;
    private JLabel signup;

    /**
     * Constructor
     */
    public Log_in() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
