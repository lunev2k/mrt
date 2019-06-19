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
            double d = Float.parseFloat(textField2.getText());
            double d1 = Float.parseFloat(textField3.getText());
            double pg1 = Float.parseFloat(textField4.getText());
            double pg2 = Float.parseFloat(textField5.getText());
            double ak = 0.785 * (Math.pow(d, 2) - Math.pow(d1, 2));
            double ad = Math.pow(d, 2) * 0.785;
            double sp = 100 * ak / ad;
            double pk = ak / ad;
            double hnu = 10 / pk;
            double hny = 10 / d1;
            String text = "";

            if (pg1 < -15) {
                text = "Межпозвоночная грыжа приблизительно равна 0.6 см";
            }
            if (pg1 < -30) {
                text = "Межпозвоночная грыжа приблизительно равна 1 см";
            }
            if (pg1 < -90) {
                text = "Межпозвоночный диск не существует";
            }

            if (pg2 < -15) {
                text = "Межпозвоночная грыжа приблизительно равна 0.6 см";
            }
            if (pg2 < -30) {
                text = "Межпозвоночная грыжа приблизительно равна 1 см";
            }
            if (pg2 < -90) {
                text = "Межпозвоночный диск не существует";
            }

            resultWindow.setText(text);
            resultWindow.setVisible(true);
        }
    }
}
