package uebungen.tasks.simpleCalculator;

import javax.swing.JOptionPane;

public class SimpleCalculator {

    public static void main(String[] args) {
        int number1 = getIntFromUser("Enter the first number:");
        int number2 = getIntFromUser("Enter the second number:");
        String operation = getOperationFromUser("Choose an operation (+, -, *, /):");
        
        int result = 0;
        boolean validOperation = true;

        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero.");
                    validOperation = false;
                } else {
                    result = number1 / number2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid operation selected.");
                validOperation = false;
        }

        if (validOperation) {
            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }
    }

    private static int getIntFromUser(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer.");
            }
        }
    }

    private static String getOperationFromUser(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                return input;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid operation! Please enter +, -, *, or /.");
            }
        }
    }
}
