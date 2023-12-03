package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 03.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Log_in extends JFrame {

    private JPanel panel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton logInButton;
    private JButton closeButton;
    private JLabel login;
    private JLabel password;
    private JLabel welcome;

    /**
     * Constructor
     */
    public Log_in() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 170);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
