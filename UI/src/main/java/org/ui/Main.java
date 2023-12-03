package org.ui;

import org.ui.program.Program;

import javax.swing.*;

/**
 * Created on 3.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Main extends JFrame {

    private JButton STARTButton;
    private JButton debuggingButton;
    private JButton propertiesButton;
    private JButton exitButton;
    private JPanel panel;
    private JLabel welcome;
    private JLabel what_to_do;
    private JLabel choose_from;

    /**
     * Constructor
     */
    Main() {
        setContentPane(panel);
        setTitle("Quiz");
        setSize(540, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Program::new);
    }
}
