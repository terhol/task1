package se.terhol;

/**
 * Task and memory manager.
 *
 * @author Tereza Holm
 */
public class Planner {

    /**
     * Moves task from one memory to another.
     *
     * @param source      the original memory which is the task allocated to
     * @param destination the memory where the task is being allocated to
     * @param task        task which is being moved from one memory to another
     * @return TRUE if the task has been successfully moved, otherwise FALSE
     */
    public boolean move(Memory source, Memory destination, Task task) {
        if (source == null || destination == null || task == null) {
            return false;
        }

        boolean isMoved = false;
        boolean hasEnoughSpace = task.getRequiredMemory() <= destination.getFreeVolume();
        boolean canBeMoved = task.getRequiredMemory() <= source.getAllocatedVolume();

        if (task.isActive() && canBeMoved && hasEnoughSpace) {
            isMoved = source.release(task) && destination.allocate(task);
        }

        return isMoved;
    }
}