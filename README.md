# Java Swing

[![Java Swing](https://raw.githubusercontent.com/kmajhi/java-swing/main/java%20swing.png)](https://github.com/kmajhi/java-swing)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Java Swing is a powerful and user-friendly GUI toolkit for building Java desktop applications. It provides a set of components and tools that allow developers to create interactive and visually appealing graphical interfaces.

This GitHub repository showcases various examples and demos to help you get started with Java Swing.

## Features

- **Rich Set of Components**: Java Swing offers a wide range of components, including buttons, labels, text fields, sliders, tables, and more, to create versatile user interfaces.

- **Event Handling**: Easily handle user interactions and events like button clicks, mouse movements, and key presses to make your applications responsive.

- **Layout Managers**: Employ various layout managers like BorderLayout, GridLayout, and BoxLayout to arrange components dynamically and adapt to different screen sizes.

- **Customization**: Customize the look and feel of your GUI using themes, styles, and custom rendering.

- **Support for Internationalization**: Java Swing supports internationalization and localization, making it easier to create applications for a global audience.

## Getting Started

To get started with Java Swing, make sure you have the latest version of Java Development Kit (JDK) installed on your system. You can download the JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/kmajhi/java-swing.git
```

## Usage

The examples provided in this repository are organized into separate packages for each feature or component. You can explore each package to understand the implementation and usage.

```java
// Import the necessary Swing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIApp extends JFrame {

    public MyGUIApp() {
        // Set up the JFrame properties
        this.setTitle("My Java Swing App");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel label = new JLabel("Welcome to Java Swing!");

        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyGUIApp.this, "Hello, Swing!");
            }
        });

        // Set up the layout
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        // Display the JFrame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyGUIApp());
    }
}
```

## Examples

Here are some examples available in this repository:

1. [SimpleButtonExample](/src/main/java/com/example/swing/SimpleButtonExample.java): Demonstrates creating a basic button and handling its click event.

2. [LabelAndTextFieldExample](/src/main/java/com/example/swing/LabelAndTextFieldExample.java): Shows how to add labels and text fields to accept user input.

3. [TableExample](/src/main/java/com/example/swing/TableExample.java): Illustrates the usage of JTable to display tabular data.

Feel free to explore each example and try them out!

## Contributing

We welcome contributions to enhance the repository and include more Java Swing examples. If you find any issues or have new examples to add, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify the code as per the license terms.
