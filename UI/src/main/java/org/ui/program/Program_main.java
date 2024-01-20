package org.ui.program;

import javax.swing.*;

/**
 * Created on 20.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Program_main extends JFrame {

    private JPanel panel;
    private JButton logOutButton;
    private JButton tutorialButton;
    private JButton startButton;
    private JButton infoButton;
    private JButton closeButton;
    private JButton creditsButton;
    private JLabel welcome;
    private JLabel info;

    /**
     * Constructor
     */
    public Program_main() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }
}
