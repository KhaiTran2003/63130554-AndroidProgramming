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
        
        JLabel lblSorting = new JLabel("Sắp xếp ngẫu nhiên tăng dần từ trái sang phải");
        lblSorting.setBounds(50, 20, 400, 20);
        contentPane.add(lblSorting);
       

        btn_number = new JButton[6];
        textData = new JTextField[6];
        values = new int[7];
        for (int i = 0; i < btn_number.length; i++) {
            btn_number[i] = new JButton("Số " + (i + 1));
            btn_number[i].setSize(new Dimension(100, 50));
            btn_number[i].setLocation(new Point(50 + i * 110, 50));
            contentPane.add(btn_number[i]);

            textData[i] = new JTextField();
            textData[i].setBounds(50 + i * 110, 110, 100, 30);
            contentPane.add(textData[i]);
            
            int finalI = i;
            btn_number[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    values[finalI] = RandomNumber();
                    textData[finalI].setText(Integer.toString(values[finalI]));
                    Arrays.sort(values);
                    for (int j = 0; j < btn_number.length; j++) {
                        btn_number[j].setText("Số " + (j + 1) + ": " + values[j]);
                    }
                }
            });
            
        }
        JTextField tf_sapxep = new JTextField();
        tf_sapxep = new JTextField();
        tf_sapxep.setBounds(50, 350, 700, 50);
        contentPane.add(tf_sapxep);
        
        JButton btn_sapxep = new JButton("Sắp xếp");
        btn_sapxep.setSize(new Dimension(100, 50));
        btn_sapxep.setLocation(new Point(650, 450));
        contentPane.add(btn_sapxep);
        
        public void SapXep() {
            // Lấy các giá trị từ textData
            int[] valuesToSort = new int[6];
            for (int i = 0; i < textData.length; i++) {
                try {
                    valuesToSort[i] = Integer.parseInt(textData[i].getText());
                } catch (NumberFormatException ex) {
                    // Xử lý trường hợp không thể chuyển đổi sang số
                    ex.printStackTrace();
                }
            }
            
            // Sắp xếp mảng giá trị
            Arrays.sort(valuesToSort);
            
            // Đặt lại văn bản cho các textData ở dưới
            for (int i = 0; i < textData.length; i++) {
                textData[i].setText(Integer.toString(valuesToSort[i]));
            }
    }
    private int RandomNumber() {
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
