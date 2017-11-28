/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker.gui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(getContentPane());
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public JPanel getContentPane() {
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        JLabel inputLabel = new JLabel("Digite um texto para correção");
        inputLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextArea inputTextArea = new JTextArea();
        inputTextArea.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button = new JButton("Validar texto");

        contentPane.add(inputLabel);
        contentPane.add(inputTextArea);
        contentPane.add(button);

        return contentPane;
    }
}
