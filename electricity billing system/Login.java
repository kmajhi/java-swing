import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login, cancel, signup;
    JTextField username, password;
    Choice logginin;
    Login() {
        super("Login Page");
        getContentPane().setBackground(new Color(0X78DEC7));
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(350, 120, 100, 20);
        lblusername.setFont(new Font("MV BOli", Font.BOLD, 14));
        add(lblusername);
        
        username = new JTextField();
        username.setBounds(450, 120, 150, 20);
        add(username);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("MV BOli", Font.BOLD, 14));
        lblpassword.setBounds(350, 160, 100, 20);
        add(lblpassword);
        
        password = new JTextField();
        password.setBounds(450, 160, 150, 20);
        add(password);
        
        JLabel loggininas = new JLabel("Loggin in as");
        loggininas.setFont(new Font("MV BOli", Font.BOLD, 14));
        loggininas.setBounds(350, 200, 100, 20);
        add(loggininas);
        
        logginin = new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(450, 200, 150, 20);
        add(logginin);
        
        login = new JButton("Login");
        login.setBounds(350, 260, 100, 40);
        login.setBackground(Color.orange);
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 350, 100, 40);
        cancel.setBackground(Color.orange);
        cancel.addActionListener(this);
        add(cancel);
        
        signup = new JButton("Signup");
        signup.setBackground(Color.orange);
        signup.setBounds(550, 260, 100, 40);
        signup.addActionListener(this);
        add(signup);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/secondd.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(40, 70, 250, 250);
        add(image);
        
        setSize(840, 500);
        setLocation(200, 100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String susername = username.getText();
            String spassword = password.getText();
            String user = logginin.getSelectedItem();
            
            try {
                Conn c = new Conn();
                String query = "select * from login where username = '"+susername+"' and password = '"+spassword+"' and user = '"+user+"'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    String meter = rs.getString("meter_no");
                    setVisible(false);
                    new Home(user, meter);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    username.setText("");
                    password.setText("");
                }
                
            } catch (Exception e) {
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        } else if (ae.getSource() == signup) {
            setVisible(false);
            
            new Signup();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
