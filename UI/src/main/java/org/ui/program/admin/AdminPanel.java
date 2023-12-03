package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 03.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class AdminPanel extends JFrame {

    private JButton closeButton;
    private JButton othersButton;
    private JButton showAnswersButton;
    private JButton showQuestionsButton;
    private JButton addQuestionButton;
    private JButton deleteQuestionButton;
    private JLabel welcome;
    private JLabel what_to_do;
    private JPanel panel;

    /**
     * Constructor
     */
    public AdminPanel() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 170);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
