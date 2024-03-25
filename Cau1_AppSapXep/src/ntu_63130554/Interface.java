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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame {
    private JButton[] btn_number;
    private JTextField[] textData;
    private JTextField[] textResult;
    private int[] values;

    public Interface() {
        setTitle("App sắp xếp tăng dần");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lb_title = new JLabel("Mời bạn random ngẫu nhiên 6 số");
        lb_title.setBounds(50, 20, 400, 20);
        contentPane.add(lb_title);
        
        JLabel lb_title2 = new JLabel("Dãy số sau khi sắp xếp tăng dần");
        lb_title2.setBounds(50, 20, 400, 260);
        contentPane.add(lb_title2);
        

        JLabel lb_title3 = new JLabel("Dãy số sau khi sắp xếp giảm dần");
        lb_title3.setBounds(50, 20, 400, 500);
        contentPane.add(lb_title3);
       

        btn_number = new JButton[6];
        textData = new JTextField[6];
        textResult = new JTextField[6];
        values = new int[6];
        
        for (int i = 0; i < btn_number.length; i++) {
            btn_number[i] = new JButton("Số thứ " + (i + 1));
            btn_number[i].setSize(new Dimension(100, 50));
            btn_number[i].setLocation(new Point(50 + i * 110, 50));
            contentPane.add(btn_number[i]);

            textData[i] = new JTextField();
            textData[i].setBounds(50 + i * 110, 110, 100, 30);
            contentPane.add(textData[i]);
            
            textResult[i] = new JTextField();
            textResult[i].setBounds(50 + i * 110, 170, 100, 30);
            textResult[i].setEditable(false);
            contentPane.add(textResult[i]);
            
            int finalI = i;
            btn_number[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    values[finalI] = RandomNumber();
                    textData[finalI].setText(Integer.toString(values[finalI]));
                    Arrays.sort(values);
                    
                }
            });
            
        }

        JButton btn_sapXepTang = new JButton("Sắp xếp tăng");
        btn_sapXepTang.setSize(new Dimension(100, 50));
        btn_sapXepTang.setLocation(new Point(550, 280));
        contentPane.add(btn_sapXepTang);
        btn_sapXepTang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SapXepTang();
            }
        });
        
        JButton btn_sapXepGiam = new JButton("Sắp xếp Giảm");
        btn_sapXepGiam.setSize(new Dimension(100, 50));
        btn_sapXepGiam.setLocation(new Point(350, 280));
        contentPane.add(btn_sapXepGiam);
        btn_sapXepGiam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SapXepTang();
            }
        });
    }
    public void SapXepTang() {
        int[] value = new int[6];
        for (int i = 0; i < textData.length; i++) {
            try {
                value[i] = Integer.parseInt(textData[i].getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        Arrays.sort(value);
        for (int i = 0; i < textResult.length; i++) {
        	textResult[i].setText(Integer.toString(value[i]));
        }
    }
    public void SapXepGiam() {
        int[] value = new int[6];
        for (int i = 0; i < textData.length; i++) {
            try {
                value[i] = Integer.parseInt(textData[i].getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        Arrays.sort(value);
        for (int i = 0; i < textResult.length; i++) {
        	textResult[i].setText(Integer.toString(value[i]));
        }
    }
        
        
    private int RandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
