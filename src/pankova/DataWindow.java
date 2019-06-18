package pankova;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataWindow extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton resultButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;

    private ResultWindow resultWindow;

    public DataWindow() {
        super("Данные обследования");
        getContentPane().add(panel);
        resultWindow = new ResultWindow();
        resultWindow.pack();
        setLocationRelativeTo(null);
        ActionListener actionListener = new ResultActionListener();
        resultButton.addActionListener(actionListener);
    }

    private class ResultActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultWindow.setVisible(true);
        }
    }
}
