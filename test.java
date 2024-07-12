import java.util.HashMap;
import java.util.Scanner;

public class OnlineVotingSystem {
    // HashMaps to store user credentials and votes
    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, Integer> votes = new HashMap<>();

    public static void main(String[] args) {
        // Initialize sample users and candidates
        initializeUsers();
        initializeCandidates();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Voting System!");

        // User login
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            System.out.println("Login successful!");

            // Display candidates
            System.out.println("Here are the candidates:");
            displayCandidates();

            // Voting process
            System.out.print("Enter the name of the candidate you want to vote for: ");
            String candidate = scanner.nextLine();
            if (castVote(candidate)) {
                System.out.println("Vote cast successfully!");
            } else {
                System.out.println("Invalid candidate.");
            }
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }

    // Method to initialize sample users
    private static void initializeUsers() {
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");
    }

    // Method to initialize sample candidates
    private static void initializeCandidates() {
        votes.put("Alice", 0);
        votes.put("Bob", 0);
        votes.put("Charlie", 0);
    }

    // Method to authenticate user
    private static boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    // Method to display candidates
    private static void displayCandidates() {
        for (String candidate : votes.keySet()) {
            System.out.println(candidate);
        }
    }

    // Method to cast vote
    private static boolean castVote(String candidate) {
        if (votes.containsKey(candidate)) {
            votes.put(candidate, votes.get(candidate) + 1);
            return true;
        }
        return false;
    }
}
