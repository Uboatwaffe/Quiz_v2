package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 21.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class AdminPanel extends JFrame {

    private JPanel panel;
    private JButton addQuestionButton;
    private JButton deleteQuestionButton;
    private JButton showAnswersButton;
    private JButton otherButton;
    private JButton showQuestionsButton;
    private JButton closeButton;
    private JLabel welcome;
    private JLabel info;

    /**
     * Constructor
     */
    public AdminPanel() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
