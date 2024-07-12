import java.util.Random;

public class RandomPasswordGenerator {
    // Method to generate a random password
    public static String generatePassword(int length) {
        // Characters allowed in the password
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Loop to generate each character of the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Define the desired length of the password
        int length = 12;
        // Generate the password
        String password = generatePassword(length);
        // Print the generated password
        System.out.println("Generated Password: " + password);
    }
}
