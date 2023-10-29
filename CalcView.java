package Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcView {
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;

    public CalcView() {
        frame = new JFrame("AT 4-operations calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Ubuntu", Font.PLAIN, 24));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        buttonPanel.add(new JButton());

        equalsButton = new JButton("=");
        buttonPanel.add(equalsButton);

        for (int i = 0; i < 4; ++i) {
            buttonPanel.add(operatorButtons[i]);
        }

        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setFocusable(true);
    }

    public void addNumberButtonListener(int index, ActionListener listener) {
        numberButtons[index].addActionListener(listener);
    }

    public void addOperatorButtonListener(int index, ActionListener listener) {
        operatorButtons[index].addActionListener(listener);
    }

    public void addEqualsButtonListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public String getDisplay() {
        return display.getText();
    }

    public void setDisplay(String text) {
        display.setText(text);
    }
}