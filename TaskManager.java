import java.util.*;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();
        System.out.print("Enter task description: ");
        String description = sc.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = sc.nextLine();

        tasks.add(new Task(title, description, dueDate));
        System.out.println("✅ Task Added Successfully!");
    }

    public void viewTasks() {
        System.out.println("\n📌 Your Tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void editTask() {
        viewTasks();
        System.out.print("Enter task number to edit: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new title: ");
            tasks.get(index).setTitle(sc.nextLine());
            System.out.print("Enter new description: ");
            tasks.get(index).setDescription(sc.nextLine());
            System.out.print("Enter new due date (YYYY-MM-DD): ");
            tasks.get(index).setDueDate(sc.nextLine());
            System.out.println("✅ Task Updated Successfully!");
        } else {
            System.out.println("❌ Invalid task number.");
        }
    }

    public void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("✅ Task Deleted!");
        } else {
            System.out.println("❌ Invalid task number.");
        }
    }

    public void markTaskCompleted() {
        viewTasks();
        System.out.print("Enter task number to mark as completed: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("✅ Task Marked as Completed!");
        } else {
            System.out.println("❌ Invalid task number.");
        }
    }

    public void searchTask() {
        System.out.print("Enter task title to search: ");
        String query = sc.nextLine().toLowerCase();
        boolean found = false;

        for (Task task : tasks) {
            if (task.getTitle().toLowerCase().contains(query)) {
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No tasks found.");
        }
    }
}
