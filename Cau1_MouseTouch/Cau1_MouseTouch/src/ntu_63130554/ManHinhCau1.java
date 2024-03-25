package ntu_63130554;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class ManHinhCau1 extends JFrame {

    private JLabel[][] mouseLabels; 
    private int numRows = 4; 
    private int numCols = 5; 
    private int labelWidth = 150; 
    private int labelHeight = 150;

    public ManHinhCau1() {
        setTitle("Catch the Mouse");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mouseLabels = new JLabel[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                JLabel mouseLabel = new JLabel();
                URL urlIconMouse = ManHinhCau1.class.getResource("icon_mouse.jpg");
                ImageIcon mouseIcon = createResizedImageIcon(urlIconMouse, labelWidth, labelHeight);
                if (mouseIcon != null) {
                    mouseLabel.setIcon(mouseIcon);
                } else {
                    System.err.println("Lỗi");
                }
                mouseLabel.setBounds(j * labelWidth, i * labelHeight, labelWidth, labelHeight);
                getContentPane().add(mouseLabel);
                mouseLabels[i][j] = mouseLabel;
            }
        }
        
        getContentPane().setLayout(null);
    }

    protected ImageIcon createResizedImageIcon(URL url, int width, int height) {
        if (url != null) {
            try {
                BufferedImage originalImage = ImageIO.read(url);
                Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                return new ImageIcon(resizedImage);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            System.err.println("Không tìm thấy: " + url);
            return null;
        }
    }
}
