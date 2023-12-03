package org.ui.program;

import javax.swing.*;

/**
 * Created on 03.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Program extends JFrame {

    private JPanel panel;
    private JButton tutorialButton;
    private JButton adminPanelButton;
    private JButton startButton;
    private JButton infoButton;
    private JButton closeButton;
    private JButton creditsButton;
    private JLabel what_to_do;
    private JLabel welcome_quiz;
    private JLabel spacer;

    /**
     * Constructor
     */
    public Program() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 220);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
