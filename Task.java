import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private int taskId;
    private String taskDescription;

    public Task(int taskId, String taskDescription) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + " - " + taskDescription;
    }
}

 class TaskManager {

    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int nextId = 1;

    // Method to create a new task
    public static void createTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(nextId++, description);
        tasks.add(task);
        System.out.println("Task created successfully.");
    }

    // Method to display all tasks
    public static void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks List:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    // Method to update an existing task
    public static void updateTask() {
        System.out.print("Enter the Task ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        Task taskToUpdate = null;
        for (Task task : tasks) {
            if (task.getTaskId() == id) {
                taskToUpdate = task;
                break;
            }
        }

        if (taskToUpdate != null) {
            System.out.print("Enter the new description for the task: ");
            String newDescription = scanner.nextLine();
            taskToUpdate.setTaskDescription(newDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }

    // Method to delete a task
    public static void deleteTask() {
        System.out.print("Enter the Task ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        Task taskToDelete = null;
        for (Task task : tasks) {
            if (task.getTaskId() == id) {
                taskToDelete = task;
                break;
            }
        }

        if (taskToDelete != null) {
            tasks.remove(taskToDelete);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }

    // Method to display the main menu and handle user choices
    public static void mainMenu() {
        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Create a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    readTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting the Task Manager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
