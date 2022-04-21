import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;


public class Viewer {

    JTextField textField;

    public Viewer() {
        Controller controller = new Controller(this);
    
        Font font = new Font("Arial", Font.BOLD, 21);
        textField = new JTextField();
        textField.setBounds(100, 70, 295, 70);
        textField.setFont(font);
        textField.setForeground(java.awt.Color.DARK_GRAY);

        JButton buttonDeleteAll = new JButton("C");
        buttonDeleteAll.setBounds(100, 145, 70, 70);
        buttonDeleteAll.setFont(font);
        buttonDeleteAll.setForeground(java.awt.Color.DARK_GRAY);
        buttonDeleteAll.addActionListener(controller);
        buttonDeleteAll.setActionCommand("DeleteAll");


        JButton buttonDegree = new JButton("^");
        buttonDegree.setBounds(175, 145, 70, 70);
        buttonDegree.setFont(font);
        buttonDegree.setForeground(java.awt.Color.DARK_GRAY);
        buttonDegree.addActionListener(controller);
        buttonDegree.setActionCommand("Degree");

        JButton buttonRoot = new JButton("RT");
        buttonRoot.setBounds(250, 145, 70, 70);
        buttonRoot.setFont(font);
        buttonRoot.setForeground(java.awt.Color.DARK_GRAY);
        buttonRoot.addActionListener(controller);
        buttonRoot.setActionCommand("Root");

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(325, 145, 70, 70);
        buttonDivide.setFont(font);
        buttonDivide.setForeground(java.awt.Color.DARK_GRAY);
        buttonDivide.addActionListener(controller);
        buttonDivide.setActionCommand("Divide");

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(100, 220, 70, 70);
        buttonSeven.setFont(font);
        buttonSeven.setForeground(java.awt.Color.DARK_GRAY);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(175, 220, 70, 70);
        buttonEight.setFont(font);
        buttonEight.setForeground(java.awt.Color.DARK_GRAY);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(250, 220, 70, 70);
        buttonNine.setFont(font);
        buttonNine.setForeground(java.awt.Color.DARK_GRAY);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(325, 220, 70, 70);
        buttonMultiply.setFont(font);
        buttonMultiply.setForeground(java.awt.Color.DARK_GRAY);
        buttonMultiply.addActionListener(controller);
        buttonMultiply.setActionCommand("Multiply");

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(100, 295, 70, 70);
        buttonFour.setFont(font);
        buttonFour.setForeground(java.awt.Color.DARK_GRAY);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(175, 295, 70, 70);
        buttonFive.setFont(font);
        buttonFive.setForeground(java.awt.Color.DARK_GRAY);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(250, 295, 70, 70);
        buttonSix.setFont(font);
        buttonSix.setForeground(java.awt.Color.DARK_GRAY);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");

        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(325, 295, 70, 70);
        buttonSubtract.setFont(font);
        buttonSubtract.setForeground(java.awt.Color.DARK_GRAY);
        buttonSubtract.addActionListener(controller);
        buttonSubtract.setActionCommand("Subtract");

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(100, 370, 70, 70);
        buttonOne.setFont(font);
        buttonOne.setForeground(java.awt.Color.DARK_GRAY);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(175, 370, 70, 70);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(java.awt.Color.DARK_GRAY);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(250, 370, 70, 70);
        buttonThree.setFont(font);
        buttonThree.setForeground(java.awt.Color.DARK_GRAY);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");

        JButton buttonAdd = new JButton("+");
        buttonAdd.setBounds(325, 370, 70, 145);
        buttonAdd.setFont(font);
        buttonAdd.setForeground(java.awt.Color.DARK_GRAY);
        buttonAdd.addActionListener(controller);
        buttonAdd.setActionCommand("Add");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(100, 445, 70, 70);
        buttonZero.setFont(font);
        buttonZero.setForeground(java.awt.Color.DARK_GRAY);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(175, 445, 70, 70);
        buttonDot.setFont(font);
        buttonDot.setForeground(java.awt.Color.DARK_GRAY);
        buttonDot.addActionListener(controller);
        buttonDot.setActionCommand("Dot");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(250, 445, 70, 70);
        buttonEqual.setFont(font);
        buttonEqual.setForeground(java.awt.Color.DARK_GRAY);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        


        JFrame frame = new JFrame("Calculator");
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.add(textField);
        
        frame.add(buttonDeleteAll);
        frame.add(buttonDegree);
        frame.add(buttonRoot);
        frame.add(buttonDivide);
        
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonMultiply);

        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSubtract);

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonAdd);

        frame.add(buttonZero);
        frame.add(buttonDot);
        frame.add(buttonEqual);

        frame.setVisible(true);

    }

    public void update(String text) {
        textField.setText(text);
    }
}
