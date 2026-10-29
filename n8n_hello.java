import java.util.Scanner;

public class n8n_hello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Print prompt to stderr so stdout remains the echoed input (useful for pipelines)
            System.err.print("Enter text: ");
            // Check for EOF before reading to avoid NoSuchElementException
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);
            }
        }
    }
}
