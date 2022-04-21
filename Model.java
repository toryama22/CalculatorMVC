import java.lang.Math;

public class Model {
    
    private Viewer viewer;
    private String temp;
    private String leftValue;
    DoubleStack stackOfDouble;
    MyStack stackOfOperators;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        stackOfDouble = new DoubleStack();
        stackOfOperators = new MyStack();
    }

    public String translateToRPN(String expr) {
        String current = "";
        int priority;
        for (int i = 0; i < expr.length(); i++) {
            priority = getPriority(expr.charAt(i));
            if (priority == 0) {
                current = current + expr.charAt(i);
            }

            if (priority > 1) {
                current = current + " ";
                while (!stackOfOperators.isEmpty()) {
                    if (getPriority(stackOfOperators.peek()) >= priority) {
                        current = current + stackOfOperators.pop();
                    }

                    else {
                        break;
                    }
                }

                stackOfOperators.push(expr.charAt(i));

            }
        }

        while (!stackOfOperators.isEmpty()) {
            current = current + stackOfOperators.pop();
        }

        return current;
    }

    public int getPriority(char symbol) {
        int priority;
        if (symbol == '+' || symbol == '-') {
            priority = 2;
        }

        else if (symbol == '*' || symbol == '/') {
            priority = 3;
        }

        else {
            return 0;
        }

        return priority;
    } 

    private double RPNtoAnswer(String rpn) {
        String operand = "";
        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ') {
                continue;
            }

            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0) {
                    operand = operand + rpn.charAt(i++);
                    if (i == rpn.length()) {
                        break;
                    }
                }

                stackOfDouble.push(Double.parseDouble(operand));
                operand = "";
            }

            if (getPriority(rpn.charAt(i)) > 1) {
                double a = stackOfDouble.pop();
                double b = stackOfDouble.pop();

                switch (rpn.charAt(i)) {
                    case '+':
                        stackOfDouble.push(b + a);
                        break;
                    case '-':
                        stackOfDouble.push(b - a);
                        break;
                    case '*':
                        stackOfDouble.push(b * a);
                        break;
                    case '/':
                        stackOfDouble.push(b / a);
                        break;
                }
            }
        }

        return stackOfDouble.pop();
    }

    public void doAction(String command) {
        double answer = 0.0;
        double otherResult;
        
        switch (command) {
            case "One":
                temp = temp + "1";
                break;
            case "Two":
                temp = temp + "2";
                break;
            case "Three":
                temp = temp + "3";
                break;
            case "Four":
                temp = temp + "4";
                break;
            case "Five":
                temp = temp + "5";
                break;
            case "Six":
                temp = temp + "6";
                break;
            case "Seven":
                temp = temp + "7";
                break;
            case "Eight":
                temp = temp + "8";
                break;
            case "Nine":
                temp = temp + "9";
                break;
            case "Zero":
                temp = temp + "0";
                break;
            case "Multiply":
                temp = temp + " * ";
                break;
            case "Divide":
                temp = temp + " / ";
                break;
            case "Add":
                temp = temp + " + ";
                break;
            case "Subtract":
                temp = temp + " - ";
                break;
            case "Degree":
                leftValue = temp;
                otherResult = Double.parseDouble(leftValue);
                otherResult = Math.pow(otherResult, 2); 
                temp = "" + otherResult;
                if (temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '.') {
                    temp = temp.substring(0, temp.length() - 2);
                }
                break;
            case "Root":
                leftValue = temp;
                otherResult = Double.parseDouble(leftValue);
                otherResult = Math.sqrt(otherResult); 
                temp = "" + otherResult;
                if (temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '.') {
                    temp = temp.substring(0, temp.length() - 2);
                }
                break;
            case "Dot":
                temp = temp + ".";
                break;
            case "DeleteAll":
                temp = "";
                while(!stackOfDouble.isEmpty() && !stackOfOperators.isEmpty()) {
                    stackOfOperators.pop();
                    stackOfDouble.pop();
                }
                break;
        }

        if (command.equals("Equal")) {
            String values = temp.replace(" ", "");
            String exprAsRPN = translateToRPN(values);
            answer = RPNtoAnswer(exprAsRPN);
            System.out.println(answer);
            temp = "" + answer;
            if (temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '.') {
                temp = temp.substring(0, temp.length() - 2);
            }            
        }

        viewer.update(temp);

    }
}


