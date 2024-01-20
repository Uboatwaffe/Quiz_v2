package org.ui;

import org.ui.program.Program_main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 18.01.2024
 *
 * @author Maciej
 * @version 0.1
 */
public class Main extends JFrame {

    private JPanel main_panel;

    // Here is main panel
    private JPanel quiz_panel;
    private JPanel properties_panel;
    private JPanel debugging_panel;
    private JButton quiz_start;
    private JLabel quiz_welcome;
    private JLabel quiz_info;
    private JButton exitButton;
    private JLabel quiz_info2;
    private JTabbedPane tabbedPane;
    private JLabel quiz_info3;

    // Here is properties panel
    private JLabel properties_info;

    // Here is debugging panel
    private JLabel debugging_info;

    /**
     * Constructor
     */
    Main() {
        setContentPane(main_panel);
        setTitle("Quiz");
        setSize(530, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        exitButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Program_main::new);
    }
}
