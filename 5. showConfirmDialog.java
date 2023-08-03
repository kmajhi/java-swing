import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int choice =0;
        ImageIcon img = new ImageIcon("C:\\ image link");
        do{
            String f_name = JOptionPane.showInputDialog(null,"Enter your first name: ", "Jeff Association", JOptionPane.INFORMATION_MESSAGE);
            String l_name = JOptionPane.showInputDialog(null,"Enter your last name: ", "Jeff Association", JOptionPane.INFORMATION_MESSAGE);
            String total_name = f_name + " " + l_name;
            JOptionPane.showMessageDialog(null,"Welcome, "+ total_name,null,JOptionPane.INFORMATION_MESSAGE,img);
            Object[] message = {img, "Do you want to quit?"};
            System.out.println("User entered first name: "+ f_name+ "\nUser entered first name: "+l_name);
             choice = JOptionPane.showConfirmDialog(null,message,"Confirm Message",JOptionPane.YES_NO_CANCEL_OPTION);
            if(choice==JOptionPane.NO_OPTION){
                System.out.println("User choosed \"No\" option");
            } else if(choice==JOptionPane.YES_OPTION){
                System.out.println("User choosed \"Yes\" option");
            } else if(choice==JOptionPane.CANCEL_OPTION){
                System.out.println("User chosed \"Cancel\" option");
            }
            else{
                System.out.println("User choosed \"X\" option");
            }
        } while(choice!=JOptionPane.YES_OPTION);

    }
}
