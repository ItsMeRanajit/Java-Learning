import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String stringWithoutSpaces = scanner.next();

        // Consume the newline character left by scanner.next()
        // scanner.nextLine();

        System.out.print("Enter the second string with spaces: ");
        String stringWithSpaces = scanner.nextLine();

        scanner.close();

        System.out.println(stringWithoutSpaces);
        System.out.print(" ");
        System.out.println(stringWithSpaces);
        
    }
}
