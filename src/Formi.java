import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formi {
    private JPanel panel1;
    private JButton button1;
    private JCheckBox checkBox1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formi");
        frame.setContentPane(new Formi().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Formi() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button1.setText("Cambiado de nuevo");
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
