import java.util.Scanner;

class ChooseYourAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Choose Your Adventure'!");
        System.out.println("You're in a mysterious forest. Your goal is to find a way out safely.");
        
        System.out.println("\nYou see two paths ahead. Do you:");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        System.out.print("Enter your choice (1 or 2): ");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            System.out.println("\nYou chose the left path. It leads to a calm river.");
            System.out.println("Do you:");
            System.out.println("1. Swim across.");
            System.out.println("2. Build a raft.");
            System.out.print("Enter your choice (1 or 2): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.println("\nYou try to swim across, but the current is too strong. You drown. Game Over!");
            } else if (choice2 == 2) {
                System.out.println("\nYou build a raft and safely cross the river. You find a village and are rescued. You Win!");
            } else {
                System.out.println("\nInvalid choice. Game Over!");
            }

        } else if (choice1 == 2) {
            System.out.println("\nYou chose the right path. It leads to a dark cave.");
            System.out.println("Do you:");
            System.out.println("1. Enter the cave.");
            System.out.println("2. Turn back.");
            System.out.print("Enter your choice (1 or 2): ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.println("\nYou enter the cave and encounter a sleeping bear.");
                System.out.println("Do you:");
                System.out.println("1. Sneak past the bear.");
                System.out.println("2. Fight the bear.");
                System.out.print("Enter your choice (1 or 2): ");
                int choice3 = scanner.nextInt();

                if (choice3 == 1) {
                    System.out.println("\nYou successfully sneak past the bear and find an exit. You Win!");
                } else if (choice3 == 2) {
                    System.out.println("\nThe bear wakes up and attacks you. Game Over!");
                } else {
                    System.out.println("\nInvalid choice. Game Over!");
                }

            } else if (choice2 == 2) {
                System.out.println("\nYou turn back and get lost in the forest. Game Over!");
            } else {
                System.out.println("\nInvalid choice. Game Over!");
            }

        } else {
            System.out.println("\nInvalid choice. Game Over!");
        }

        scanner.close();
    }
}
