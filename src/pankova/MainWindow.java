package pankova;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JTextField nameTextField;
    private JTextField ageTextField;
    private JTextField heightTextField;
    private JTextField weightTextField;
    private JButton dataButton;
    private JButton loadButton;
    private JPanel panel;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel heightLabel;
    private JLabel weightLabel;

    private DataWindow dataWindow;

    public MainWindow() {
        super("Диагностика по МРТ");
        getContentPane().add(panel);
        dataWindow = new DataWindow();
        dataWindow.pack();
        setLocationRelativeTo(null);

        loadButton.setEnabled(System.getProperty("os.name").toLowerCase().indexOf("win") == 0);

        ActionListener dataActionListener = new DataActionListener();
        dataButton.addActionListener(dataActionListener);
        ActionListener loadActionListener = new LoadActionListener();
        loadButton.addActionListener(loadActionListener);
    }

    private class DataActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dataWindow.setVisible(true);
        }
    }

    private class LoadActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Загрузка МРТ");
        }
    }
}
