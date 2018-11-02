package se.terhol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Tereza Holm
 */
class MemoryTest {

    @Test
    void allocate() {
        Memory memory = new Memory(2);
        Task task1 = new Task(1);
        Task task2 = new Task(2);

        memory.allocate(null);
        assertTrue(memory.allocate(task1));
        assertFalse(memory.allocate(task1));
        assertFalse(memory.allocate(task2));
    }

    @Test
    void release() {
        // TODO: Write tests
    }
}