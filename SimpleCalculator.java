import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Components
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    private JPanel panel;
    
    // Variables
    private double num1, num2, result;
    private char operator;

    public SimpleCalculator() {
        // Initialize the frame
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize variables
        num1 = 0.0;
        num2 = 0.0;
        operator = '\0';
        result = 0.0;

        // Create components
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = equalsButton;
        functionButtons[5] = clearButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
        }

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add components to the panel
        panel.add(textField);
        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(functionButtons[0]);
        panel.add(numberButtons[0]);
        panel.add(functionButtons[1]);
        panel.add(functionButtons[2]);
        panel.add(functionButtons[3]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(functionButtons[4]);
        panel.add(functionButtons[5]);

        // Add the panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (e.getSource() == clearButton) {
            textField.setText("");
            num1 = num2 = result = 0.0;
            operator = '\0';
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == subtractButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == multiplyButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == divideButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == equalsButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCalculator();
            }
        });
    }
}
