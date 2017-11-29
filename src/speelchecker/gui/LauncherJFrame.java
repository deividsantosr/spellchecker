/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deividnetwork
 */
public class LauncherJFrame extends JFrame {

    JPanel contentPane = new JPanel();

    public LauncherJFrame() {
        super("Corretor Ortográfico");
        initialize();
    }

    public void initialize() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(getContentPane());
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public JPanel getContentPane() {
        contentPane.setLayout(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));

        JLabel inputLabel = new JLabel("Digite abaixo para validar a ortografia");
        inputLabel.setBorder(new EmptyBorder(0, 0, 15, 0));

        JTextArea inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setFocusable(true);
        inputTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));

        JScrollPane inputScroll = new JScrollPane(inputTextArea);
        inputScroll.setBorder(new EmptyBorder(0, 0, 10, 0));

        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setLineWrap(true);
        outputTextArea.setWrapStyleWord(true);
        outputTextArea.setEditable(false);
        outputTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));

        JScrollPane outputScroll = new JScrollPane(outputTextArea);
        outputScroll.setBorder(new EmptyBorder(0, 10, 10, 0));

        JButton button = new JButton("Validar texto");

        contentPane.add(inputLabel, BorderLayout.PAGE_START);
        contentPane.add(inputScroll, BorderLayout.CENTER);
        contentPane.add(outputScroll, BorderLayout.LINE_END);
        contentPane.add(button, BorderLayout.PAGE_END);

        return contentPane;
    }
}
