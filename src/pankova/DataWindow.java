package pankova;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataWindow extends JFrame {
    private JPanel panel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton resultButton;
    private JTextField textField1;
    private JTextField textField6;
    private JTextField textField7;

    private ResultWindow resultWindow;

    private Diagnosis diagnosis;

    public DataWindow() {
        super("Данные обследования");
        getContentPane().add(panel);

        diagnosis = new Diagnosis();

        resultWindow = new ResultWindow();
        resultWindow.pack();
        setLocationRelativeTo(null);
        ActionListener actionListener = new ResultActionListener();
        resultButton.addActionListener(actionListener);
    }

    private class ResultActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double d = Float.parseFloat(textField2.getText());
            double d1 = Float.parseFloat(textField3.getText());
            double v = Float.parseFloat(textField7.getText());

            String result = diagnosis.calculate(d, d1, v);

            resultWindow.setText(result);
            resultWindow.setVisible(true);
        }
    }
}
