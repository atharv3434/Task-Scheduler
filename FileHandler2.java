import java.io.*;
import java.util.List;

public class FileHandler2 {
    public static void saveTasks(List<Task> tasks) {
        try (FileWriter writer = new FileWriter("tasks.txt", false)) {
            for (Task t : tasks) {
                writer.write(t.getTitle() + "|" + t.getDescription() + "|" + t.getDueDate() + "|" + t.isCompleted() + "\n");
            }
        } catch (IOException e) {
            System.out.println("❌ Error saving tasks.");
        }
    }

    public static void loadTasks(List<Task> tasks) {
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                Task task = new Task(parts[0], parts[1], parts[2]);
                if (Boolean.parseBoolean(parts[3])) {
                    task.markCompleted();
                }
                tasks.add(task);
            }
        } catch (IOException e) {
            System.out.println("❌ Error loading tasks.");
        }
    }
}
