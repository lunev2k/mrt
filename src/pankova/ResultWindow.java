package pankova;

import javax.swing.*;

public class ResultWindow extends JFrame {

    private JPanel panel;
    private JTextArea textArea1;

    public ResultWindow() {
        super("Результат обследования");
        getContentPane().add(panel);
        setLocationRelativeTo(null);
    }
}
