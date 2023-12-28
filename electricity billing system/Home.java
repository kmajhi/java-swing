import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    String atype, meter;
    Home(String atype, String meter) {
        this.atype = atype;
        this.meter = meter;
        setLayout(null);
        setBounds(300, 100, 700, 600);
        setResizable(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elec1.png"));
        Image i2 = i1.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color(0XFF5757));
        setJMenuBar(mb);
        
        JMenu master = new JMenu("Administrator");
        master.setFont(new Font("MV Boli", Font.BOLD, 25));
        master.setForeground(Color.black);
        
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("MV Boli", Font.BOLD, 15));
        newcustomer.setBackground(Color.WHITE);
        newcustomer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        newcustomer.setPreferredSize(new Dimension(170, 50));
        newcustomer.addActionListener(this);
        master.add(newcustomer);
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("MV Boli", Font.BOLD, 15));
        customerdetails.setBackground(Color.WHITE);  
        customerdetails.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        customerdetails.setPreferredSize(new Dimension(170, 50));
        customerdetails.addActionListener(this);
        master.add(customerdetails);
     
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("MV Boli", Font.BOLD, 15));
        calculatebill.setBackground(Color.WHITE);
        calculatebill.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        calculatebill.setPreferredSize(new Dimension(170, 50));
        calculatebill.addActionListener(this);
        master.add(calculatebill);
        
        JMenu info = new JMenu("Information");
        info.setFont(new Font("MV Boli", Font.BOLD, 25));
        info.setForeground(Color.black);
        
        
        JMenuItem viewinformation = new JMenuItem("View Information");
        viewinformation.setFont(new Font("MV Boli", Font.BOLD, 15));
        viewinformation.setBackground(Color.WHITE);
        viewinformation.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        viewinformation.setPreferredSize(new Dimension(170, 50));
        viewinformation.addActionListener(this);
        info.add(viewinformation);
   
        if (atype.equals("Admin")) {
            mb.add(master);
        } else {
            mb.add(info);
        }
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("New Customer")) {
            new NewCustomer();
        } else if (msg.equals("Customer Details")) {
            new CustomerDetails();
        } else if (msg.equals("Calculate Bill")) {
            new CalculateBill();
        } else if (msg.equals("View Information")) {
            new ViewInformation(meter);
        } 
    }

    public static void main(String[] args) {
        new Home("", "");
    }
}
