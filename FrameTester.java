import java.awt.*;
import javax.swing.*;

public class FrameTester {
    public static void main(String[] args){
        // The window containing the components is called a frame window.
        // This creates the frame window.
        JFrame frame = new JFrame();

        // Create a text field and set the text
        final int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        // Create button.
        JButton helloButton = new JButton("Say Hello");
        // Defines action interface using lambda expression.
        helloButton.addActionListener(event->textField.setText("Hello, World!"));

        // Create Button.
        JButton goodbyeButton = new JButton("Say Goodbye");
        goodbyeButton.addActionListener(event->textField.setText("Goodbye, World!"));

        // Defines the layout manager for the frame.
        // FlowLayout places the components next to eachother.
        frame.setLayout(new FlowLayout());

        // Add the buttons to the frame
        frame.add(helloButton);
        frame.add(goodbyeButton);
        // Add the text field to the frame.
        frame.add(textField);

        // Set condition for program exit.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set window size to be minimum needed to display all objects added.
        frame.pack();
        // Set the window to be visible.
        frame.setVisible(true);
    }
}