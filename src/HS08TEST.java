import java.text.DecimalFormat;
import java.util.Scanner;

class HS08TEST {

    public static void main ( String[] arg ) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df2 = new DecimalFormat("#.00");

        System.out.println("Enter amount to withdraw");
        int withdraw = scanner.nextInt();
        System.out.println("Enter account balance");
        double balance = scanner.nextDouble();

        if (balance < withdraw) {
            System.out.println(df2.format(balance));
        }else {
            if (withdraw % 5 == 0) {
                double remaining = (balance - withdraw) - (0.50);
                System.out.println(df2.format(remaining));
            } else {
                System.out.println(df2.format(balance));
            }
        }

    }
}
