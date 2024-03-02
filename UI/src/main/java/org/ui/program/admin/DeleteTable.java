package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 02.03.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class DeleteTable extends JFrame {

    private JPanel panel;
    private JTextField field_name;
    private JButton deleteButton;
    private JButton closeButton;
    private JLabel info;

    /**
     * Constructor
     */
    public DeleteTable() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
