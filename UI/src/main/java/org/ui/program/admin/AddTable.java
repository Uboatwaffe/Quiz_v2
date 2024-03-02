package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 02.03.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class AddTable extends JFrame {

    private JPanel panel;
    private JTextField field_name;
    private JButton setButton;
    private JButton closeButton;
    private JLabel info;

    /**
     * Constructor
     */
    public AddTable() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
