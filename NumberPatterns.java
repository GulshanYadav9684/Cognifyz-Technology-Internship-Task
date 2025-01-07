import java.util.Scanner;

 class NumberPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces before the numbers
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print spaces to center the pyramid
            }

            // Inner loop for printing numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print numbers
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
