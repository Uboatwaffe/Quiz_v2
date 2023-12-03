package org.ui.program.admin.other;

import javax.swing.*;

/**
 * Created on 03.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class AdminOther extends JFrame {

    private JButton tableManagementButton;
    private JButton closeButton;
    private JButton detailsButton;
    private JButton resetButton;
    private JButton changeTableButton;
    private JButton tutorialButton;
    private JPanel panel;

    /**
     * Constructor
     */
    public AdminOther() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 170);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
    }
}
