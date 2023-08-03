import javax.swing.*;
import java.awt.*;

class ObjectImage {
    private ImageIcon img;
    private int width;
    private int height;
    
    public ObjectImage(ImageIcon img, int width, int height) {
        this.img = img;
        this.width = width;
        this.height = height;
    }

    public ImageIcon getResizedImage() {
        Image image = img.getImage();
        Image resizedPic = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedPic);
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        ImageIcon originalImg = new ImageIcon("enter your image icon file from your directory folder");
        ObjectImage objImg = new ObjectImage(originalImg, 128, 128);

        ImageIcon resizedImg = objImg.getResizedImage();

        Object[] message_1 = {resizedImg, "Enter your first name: "};
        Object[] message_2 = {resizedImg, "Enter your last name: "};

        String f_name = JOptionPane.showInputDialog(null, message_1, "Jeff Association", JOptionPane.PLAIN_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, message_2, "Jeff Association", JOptionPane.PLAIN_MESSAGE);

        String name = f_name + " " + l_name;
        JOptionPane.showMessageDialog(null, "Welcome to Jeff Association " + name, "Jeff Association", JOptionPane.INFORMATION_MESSAGE, resizedImg);
    }
}
