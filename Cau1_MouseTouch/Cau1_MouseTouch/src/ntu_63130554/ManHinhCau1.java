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

    private JLabel mouseLabel;
    private Timer timer;
    private Random random;
    private int frameWidth;
    private int frameHeight;

    public ManHinhCau1() {
        setTitle("Catch the Mouse");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        frameWidth = getContentPane().getWidth();
        frameHeight = getContentPane().getHeight();

        mouseLabel = new JLabel();
        URL urlIconMouse = ManHinhCau1.class.getResource("icon_mouse.jpg");
        ImageIcon mouseIcon = createResizedImageIcon(urlIconMouse, 150, 150);
        if (mouseIcon != null) {
            mouseLabel.setIcon(mouseIcon);
        } else {
            System.err.println("Lỗi");
        }
        getContentPane().add(mouseLabel);
    }


    private void moveMouse() {
        int x = random.nextInt(frameWidth - mouseLabel.getWidth());
        int y = random.nextInt(frameHeight - mouseLabel.getHeight());
        mouseLabel.setLocation(x, y);
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
