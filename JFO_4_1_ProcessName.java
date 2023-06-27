import java.util.Scanner;

public class JFO_4_1_ProcessName {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        scanner.close();

        

        String fullName = scanner.nextLine();
        String[] splitName = fullName.split(" ");
        String firstName = splitName[0];
        String lastName = splitName[splitName.length - 1];

        System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0));
    }
}

