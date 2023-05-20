import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();

        Account account = new Account(userName);

        while (true) {
            System.out.println("\nWelcome " + userName + ", what would you like to do?");
            System.out.println("1: Deposit money");
            System.out.println("2: Withdraw money");
            System.out.println("3: Check balance");
            System.out.println("4: Quit");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter deposit amount:");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    int withdrawalAmount = scanner.nextInt();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Your balance is: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                    break;
            }
        }
    }
}
