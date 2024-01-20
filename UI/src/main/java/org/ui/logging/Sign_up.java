package org.ui.logging;

import javax.swing.*;

/**
 * Created on 20.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Sign_up extends JFrame {

    private JPanel panel;
    private JFormattedTextField usernameTextField;
    private JFormattedTextField passwordTextField2;
    private JFormattedTextField passwordTextField1;
    private JButton closeButton;
    private JLabel welcome;
    private JLabel username;
    private JLabel password;
    private JLabel password_repeat;
    private JButton signupButton;
    private JLabel error;

    /**
     * Constructor
     */
    public Sign_up() {
        error.setVisible(false);

        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 300);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
