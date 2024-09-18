import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Sebastian_Torres_Assignment02 {

    public static void main(String[] args) {

        DecimalFormat dollar = new DecimalFormat("0.00"); //Creates format for printing valid dollar values//

        String firstName, lastName, middleInitialString;
        char middleInitial;
        double grossAnnualPay = 0, taxRate = 0, netAnnualPay;
        int age = 0;

        firstName = JOptionPane.showInputDialog("What's your first Name?: ");


        middleInitialString = JOptionPane.showInputDialog("What's your middle Initial: ");
        char[] ch = new char[middleInitialString.length()]; //takes initial in case user inputs full name//
        ch[0] = middleInitialString.charAt(0);
        middleInitial = ch[0];


        lastName = JOptionPane.showInputDialog("What's your last Name?: ");

    boolean validAge = false; //Repeats question until valid input//
            while (!validAge) {
                try {

            age = Integer.parseInt((JOptionPane.showInputDialog("How old are you?: ")));
            validAge = true;
        }
        catch (NumberFormatException e) { //Prevents invalid inputs//

    JOptionPane.showMessageDialog(null, "Please enter a valid age!",
        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    boolean validPay = false; //Repeats question until valid input//
            while (!validPay) {
                try {

                grossAnnualPay = Double.parseDouble((JOptionPane.showInputDialog("What's your gross annual pay?: ")));
                validPay = true;
            }
            catch (NumberFormatException e) { //Prevents invalid inputs//

    JOptionPane.showMessageDialog(null, "Please enter a valid pay!",
            "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    boolean validTaxRate = false; //Repeats question until valid input//
            while (!validTaxRate) {
                try {

                taxRate = Double.parseDouble((JOptionPane.showInputDialog("What's your tax rate in decimal form?: ")));
                validTaxRate = true;
            }
            catch (NumberFormatException e) { //Prevents invalid inputs//

    JOptionPane.showMessageDialog(null, "Please enter a valid tax rate!",
        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }


            netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);


                System.out.printf("Hello " + firstName + " " + middleInitial + ". " + lastName + ",\n" +
                    "You are " + age + " years old now.\n" +
                    "It is amazing that you made " + (dollar.format(grossAnnualPay)) + " this year. With the tax\n" +
                    "rate of " + taxRate + ", you can take home $" + (dollar.format(netAnnualPay)) + ".");
        }
    }


