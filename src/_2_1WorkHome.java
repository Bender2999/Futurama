import java.util.Scanner;

public class _2_1WorkHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter what time is it now? ");
        int time = scanner.nextInt();
        if (time > 24) {
            System.out.println("Sorry you enter " + time + " Error input, the day must have only 24 hour ");
        } else if (time > 18 | time < 9) {
            System.out.println("I`m rest");
        } else {
            System.out.println("I`m working");

        }
    }
}