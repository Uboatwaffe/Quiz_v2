package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 03.03.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Reset extends JFrame {

    private JPanel panel;
    private JButton yesIDoButton;
    private JButton noIWantToButton;
    private JLabel info;

    /**
     * Constructor
     */
    public Reset() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
