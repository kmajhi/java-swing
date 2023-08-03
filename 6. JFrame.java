import javax.swing.*;
class Test extends JFrame{
    Test(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,50);
        setTitle("Jeff Association");
        setResizable(false);
        setBounds(200,50,300,300);
    }
}

public class Main {
    public static void main(String[] args) {
       Test frame = new Test();
       frame.setVisible(true);
    }
}
