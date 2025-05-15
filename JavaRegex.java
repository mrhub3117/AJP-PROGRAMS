=9)regex

for Email:
import java.util.Scanner;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);

        while (true) {
            System.out.print("Enter an email to validate (or type 'exit' to stop): ");
            String userEmail = scanner.nextLine();

            
            if (userEmail.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            
            Matcher matcher = pattern.matcher(userEmail);
            if (matcher.matches()) {
                System.out.println(userEmail + " is a valid email.");
            } else {
                System.out.println(userEmail + " is NOT a valid email.");
            }
        }


for Phone number
  import java.util.Scanner;
import java.util.regex.*;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String phoneRegex = "^[789]\\d{9}$"; 
        Pattern pattern = Pattern.compile(phoneRegex);

        while (true) {
            System.out.print("Enter a phone number to validate (or type 'exit' to stop): ");
            String userPhone = scanner.nextLine();

            // Exit condition
            if (userPhone.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

    
            Matcher matcher = pattern.matcher(userPhone);
            if (matcher.matches()) {
                System.out.println(userPhone + " is a valid phone number.");
            } else {
                System.out.println(userPhone + " is NOT a valid phone number.");
            }
        }

        scanner.close();
    }
}


        scanner.close();
    }
}
