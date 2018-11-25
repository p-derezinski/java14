package pl.sdacademy.java14poz.java21days;

import javax.swing.*;

public class Authenticator extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Anuluj");

    public Authenticator() {
        super("Informacje o koncie");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
