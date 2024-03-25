package ntu_63130554;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ManHinhCau1 extends JFrame {
    private JLabel mouseLabel;

    public ManHinhCau1() {
        setTitle("Catch the Mouse");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mouseLabel = new JLabel();
        URL urlIconMouse = ManHinhCau1.class.getResource("icon_mouse.jpg");
        ImageIcon mouseIcon = createResizedImageIcon(urlIconMouse, 50, 50); // Sử dụng phương thức createResizedImageIcon để tạo hình ảnh có kích thước đã thay đổi
        if (mouseIcon != null) {
            mouseLabel.setIcon(mouseIcon);
        } else {
            System.err.println("Couldn't load icon_mouse.jpg");
        }

        getContentPane().add(mouseLabel);
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
            System.err.println("Couldn't find file: " + url);
            return null;
        }
    }
}
