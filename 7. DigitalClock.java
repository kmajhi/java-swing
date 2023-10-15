import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setLayout(new FlowLayout());

        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
        timeLabel.setForeground(Color.red);

        frame.add(timeLabel);

        frame.setVisible(true);

        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date now = new Date();
            String timeStr = sdf.format(now);
            timeLabel.setText(timeStr);
        });
        timer.start();
    }
}
