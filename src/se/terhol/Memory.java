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

    private int getAllocatedVolume() {
        return this.allocatedCapacity;
    }

    /**
     * @return capacity without allocated capacity in MB
     */
    private int getFreeVolume() {
        return this.capacity - this.allocatedCapacity;
    }

    /**
     * Allocates memory required by task.
     *
     * @param task task which requires memory allocation
     *
     * @return TRUE if memory was successfully allocated, otherwise FALSE
     */
    private boolean allocate(Task task) {
        boolean hasBeenAllocated = false;

        if (getFreeVolume() >= task.getRequiredMemory()) {
            this.allocatedCapacity = this.allocatedCapacity + task.getRequiredMemory();
            hasBeenAllocated = true;
        }

        return hasBeenAllocated;
    }

    public String toString(){
        return "Memory: allocated " + this.allocatedCapacity + " from " + this.capacity + " MB.";
    }
}
