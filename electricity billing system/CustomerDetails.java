import java.awt.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.awt.print.PrinterException;

public class CustomerDetails extends JFrame implements ActionListener{

    JTable table;
    JButton print;
    
    CustomerDetails(){
        super("Customer Details");
        
        setSize(700, 500);
        setLocation(200, 150);
        
        table = new JTable();
        table.setBackground(new Color(0X78DEC7));
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
        
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        
        print = new JButton("Print");
        print.addActionListener(this);
        print.setBackground(new Color(0X78DEC7));
        add(print, "South");
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            table.print();
        } catch (PrinterException e) {
        }
    }

    public static void main(String[] args) {
        new CustomerDetails();
    }
}
