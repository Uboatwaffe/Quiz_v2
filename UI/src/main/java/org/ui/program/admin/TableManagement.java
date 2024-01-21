package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 21.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class TableManagement extends JFrame {

    private JPanel panel;
    private JButton addTableButton;
    private JButton deleteTableButton;
    private JButton closeButton;
    private JLabel what_to_do;

    /**
     * Constructor
     */
    public TableManagement() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
