package pankova;

import javax.swing.*;

public class ResultWindow extends JFrame {

    private JPanel panel;
    private JTextArea textArea1;

    private String text;

    public ResultWindow() {
        super("Результат обследования");
        getContentPane().add(panel);
        setLocationRelativeTo(null);
        textArea1.setText(getText());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
