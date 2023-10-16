import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());

        JLabel userLabel = new JLabel("Username: ");
        JTextField userField = new JTextField(20);
        JLabel passLabel = new JLabel("Password: ");
        JPasswordField passField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // Placeholder for spacing
        panel.add(loginButton);

        frame.add(panel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                char[] password = passField.getPassword(); 

                if (username.equals("admin") && new String(password).equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Failed. Please try again.");
                }
                passField.setText("");
            }
        });
        frame.setVisible(true);
    }
}
