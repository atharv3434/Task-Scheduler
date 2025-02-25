import java.util.Scanner;

public class Main5 {
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📅 Welcome to Task Scheduler 📅");

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Edit Task\n4. Delete Task\n5. Mark Task as Completed\n6. Search Task\n7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    taskManager.editTask();
                    break;
                case 4:
                    taskManager.deleteTask();
                    break;
                case 5:
                    taskManager.markTaskCompleted();
                    break;
                case 6:
                    taskManager.searchTask();
                    break;
                case 7:
                    System.out.println("Exiting... Have a productive day! ✅");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
