import java.util.Scanner;

public class SimpleGreetingCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the recipient's name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nChoose an occasion:");
        System.out.println("1. Birthday");
        System.out.println("2. Holiday");
        int choice = scanner.nextInt();
        String message = "";

        if (choice == 1) {
            message = "Happy Birthday, " + name + "!";
        } else if (choice == 2) {
            message = "Happy Holidays, " + name + "!";
        } else {
            message = "Invalid choice.";
        }

        System.out.println("\n--- Greeting Card ---");
        System.out.println(message);
        System.out.println("---------------------");
        
        scanner.close();
    }
}
