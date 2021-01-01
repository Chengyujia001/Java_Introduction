package C12;


/**
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline
 * calculator. Note that the program terminates if any operand is non-numeric.
 * Write a program with an exception handler that deals with non-numeric operands;
 * then write another program without using an exception handler to achieve the
 * same objective. Your program should display a message that informs the user of
 * the wrong operand type before exiting (see Figure 12.12).
 *
 */
public class hw12_1 {

    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        
        int result = 0;


        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument:\n  " + e.getMessage() + " is non-numeric");
            System.exit(0);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}