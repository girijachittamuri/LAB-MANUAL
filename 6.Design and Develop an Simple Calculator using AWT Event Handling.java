import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button add;

    Calculator() {
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        add = new Button("Add");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        t3.setBounds(50, 200, 100, 30);
        add.setBounds(50, 150, 100, 30);

        add(add);
        add(t1);
        add(t2);
        add(t3);

        add.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        t3.setText(String.valueOf(a + b));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
