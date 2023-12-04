package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 04.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Add_Q extends JFrame {

    private JPanel panel;
    private JTextField question_field;
    private JTextField answer_field;
    private JTextField explanation_field;
    private JComboBox<String> type_of_question;
    private JButton addButton;
    private JButton closeButton;
    private JLabel question_label;
    private JLabel answer_label;
    private JLabel explanation_label;
    private JLabel type_label;
    private JLabel welcome;

    /**
     * Constructor
     */
    public Add_Q() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 300);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
