import java.util.ArrayList;
import java.util.Scanner;

public class to_do_list{
    private static ArrayList<String> tasks = new ArrayList<>();
    private static ArrayList<Boolean> completed = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int activity = 0;

        // Display a menu bar to the user
        while (activity != 5) {
            System.out.println("Select your activity");
            System.out.println("1. Add a task\n2. View all tasks\n3. Mark as completed\n4. Delete a task\n5. Exit..");
            System.out.print("Select your activity from above menu: ");
            activity = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (activity) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markCompleted(sc);
                    break;
                case 4:
                    deleteTask(sc);
                    break;
                case 5:
                    System.out.println("Exited...");
                    break;
                default:
                    System.out.println("Enter a digit from 1-5 to do any task.");
            }
        }
    }

    public static void addTask(Scanner sc) {
        System.out.print("Enter a new task: ");
        String task = sc.nextLine();
        tasks.add(task);
        completed.add(false); // Mark task as not completed
        System.out.println("Task added.");
    }

    public static void viewTasks() {
        System.out.println("Your tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            String status = completed.get(i) ? " [Completed]" : " [Not Completed]";
            System.out.println((i + 1) + ". " + tasks.get(i) + status);
        }
    }

    public static void markCompleted(Scanner sc) {
        viewTasks();
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = sc.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            completed.set(taskNumber - 1, true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void deleteTask(Scanner sc) {
        viewTasks();
        System.out.print("Enter the task number to delete: ");
        int taskNumber = sc.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            completed.remove(taskNumber - 1);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

