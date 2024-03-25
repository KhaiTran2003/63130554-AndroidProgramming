package ntu_63130554;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame {
    private JButton[] buttons;
    private JTextField[] textFields;
    private int[] values;

    public Interface() {
        setTitle("App sắp xếp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        buttons = new JButton[7];
        textFields = new JTextField[7];
        values = new int[7];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Số " + (i + 1));
            buttons[i].setSize(new Dimension(100, 50));
            buttons[i].setLocation(new Point(50 + i * 110, 50));
            values[i] = generateRandomNumber(); 
            contentPane.add(buttons[i]);

            textFields[i] = new JTextField();
            textFields[i].setBounds(50 + i * 110, 110, 100, 30);
            contentPane.add(textFields[i]);

            int finalI = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textFields[finalI].setText(Integer.toString(values[finalI]));

                    Arrays.sort(values);
                    for (int j = 0; j < buttons.length; j++) {
                        buttons[j].setText("Số " + (j + 1) + ": " + values[j]);
                    }
                }
            });
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Interface frame = new Interface();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
