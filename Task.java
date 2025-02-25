public class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean isCompleted;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDueDate() { return dueDate; }
    public boolean isCompleted() { return isCompleted; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }
    public void markCompleted() { this.isCompleted = true; }

    @Override
    public String toString() {
        return "[ " + (isCompleted ? "✔" : "❌") + " ] " + title + " (Due: " + dueDate + ") - " + description;
    }
}
