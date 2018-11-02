package se.terhol;

/**
 * This class represents RAM.
 *
 * @author Tereza Holm
 */
public class Memory {

    /**
     * Capacity in MB.
     */
    private int capacity;
    private int allocatedCapacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public int getAllocatedVolume() {
        return this.allocatedCapacity;
    }

    /**
     * @return capacity without allocated capacity in MB
     */
    public int getFreeVolume() {
        return this.capacity - this.allocatedCapacity;
    }

    /**
     * Allocates memory required by task.
     *
     * @param task task which requires memory allocation
     *
     * @return TRUE if memory was successfully allocated, otherwise FALSE
     */
    public boolean allocate(Task task) {
        boolean hasBeenAllocated = false;

        if (task != null && getFreeVolume() >= task.getRequiredMemory() && !task.isActive()) {
            this.allocatedCapacity = this.allocatedCapacity + task.getRequiredMemory();
            task.activate();
            hasBeenAllocated = true;
        }

        return hasBeenAllocated;
    }

    /**
     * Deactivates task and releases memory.
     *
     * @param task task which is required to be deactivated
     *
     * @return TRUE if the memory was successfully released, otherwise FALSE
     */
    public boolean release(Task task) {
        boolean hasBeenReleased = false;

        if(task != null && task.isActive() && task.getRequiredMemory() <= getAllocatedVolume() ) {
            this.allocatedCapacity = this.allocatedCapacity - task.getRequiredMemory();
            task.deactivate();
            hasBeenReleased = true;
        }

        return hasBeenReleased;
    }

    public String toString(){
        return "Memory: allocated " + this.allocatedCapacity + " from " + this.capacity + " MB.";
    }
}
