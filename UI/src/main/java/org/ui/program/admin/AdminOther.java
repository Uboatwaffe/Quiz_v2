package org.ui.program.admin;

import javax.swing.*;

/**
 * Created on 21.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class AdminOther extends JFrame {

    private JPanel panel;
    private JButton tableManagementButton;
    private JButton tutorialButton;
    private JButton changeTableButton;
    private JButton detailsButton;
    private JButton closeButton;
    private JButton resetButton;

    /**
     * Constructor
     */
    public AdminOther() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(570, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
