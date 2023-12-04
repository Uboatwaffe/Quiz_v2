package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 04.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Delete_Q extends JFrame {

    private JPanel panel;
    private JTextField index_field;
    private JButton deleteButton;
    private JButton closeButton;
    private JLabel welcome;
    private JLabel info;
    private JCheckBox all_questions_checkbox;

    /**
     * Constructor
     */
    public Delete_Q() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(670, 190);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
