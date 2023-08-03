import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    private static ImageIcon resizeImage(ImageIcon originalIcon, int width, int height){
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    public static void main(String[] args) {
        
        ImageIcon originalImg = new ImageIcon("C:\\ *.png");
        ImageIcon resizedImg = resizeImage(originalImg, 128, 128);

        Object[] message_1 = {resizedImg, "Enter your first name: "};
        Object[] message_2 = {resizedImg, "Enter your last name: "};

        String f_name = JOptionPane.showInputDialog(null, message_1, "Jeff Association", JOptionPane.PLAIN_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, message_2, "Jeff Association", JOptionPane.PLAIN_MESSAGE);
        String name = f_name+" " + l_name;
        JOptionPane.showMessageDialog(null, "Welcome to Jeff Association "+ name, "Jeff Association", JOptionPane.INFORMATION_MESSAGE,resizedImg);
    }

}
