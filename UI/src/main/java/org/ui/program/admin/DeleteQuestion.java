package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 03.03.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class DeleteQuestion extends JFrame {

    private JPanel panel;
    private JTextField field_index;
    private JButton deleteQuestionButton;
    private JButton closeButton;
    private JLabel info;

    /**
     * Constructor
     */
    public DeleteQuestion() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
