package se.terhol;

/**
 * This class represents task which will be computed.
 *
 * @author Jan Papousek
 */
public class Task {

    private boolean active = false;

    private int requiredMemory;

    public Task(int requiredMemory) {
        this.requiredMemory = requiredMemory;
    }

    /**
     * It returns the size of memory which is required for task to be computed.
     *
     * @return Size of required memory in MB.
     */
    public int getRequiredMemory() {
        return requiredMemory;
    }

    /**
     * Check whether the task is active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Make the task active. If the task is already active, do nothing.
     *
     * @return TRUE if the task has been made active, otherwise FALSE.
     */
    public boolean activate() {
        if (isActive()) {
            return false;
        }

        active = true;

        return true;
    }

    /**
     * Deactivate the task. If the task is not active, do nothing
     *
     * @return TRUE if the task has been deactivated, otherwise FALSE.
     */
    public boolean deactivate() {
        if (!isActive()) {
            return false;
        }

        active = false;

        return true;
    }

    public String toString() {
        return "Task: " + requiredMemory + " MB - " + (active ? "active" : "inactive");
    }

}
