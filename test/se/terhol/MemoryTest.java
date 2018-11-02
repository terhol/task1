package se.terhol;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Tereza Holm
 */
@DisplayName("Memory")
class MemoryTest {

    @Nested
    @DisplayName("allocate()")
    class Allocate {

        @Test
        @DisplayName("Should not fail when task is null")
        void shouldNotFailWhenTaskIsNull() {
            Memory memory = new Memory(1);

            memory.allocate(null);
        }

        @Test
        @DisplayName("Should allocate task with full capacity")
        void shouldAllocateOkTask() {
            Memory memory = new Memory(1);
            Task okTask = new Task(1);

            assertTrue(memory.allocate(okTask));
        }

        @Test
        @DisplayName("Should not allocate task which requires bigger capacity")
        void shouldNotAllocateNokTask() {
            Memory memory = new Memory(1);
            Task nokTask = new Task(2);

            assertFalse(memory.allocate(nokTask));
        }

        @Test
        @DisplayName("Should not allocate already activated task")
        void shouldNotAllocateAlreadyActivatedTask() {
            Memory memory = new Memory(2);
            Task task = new Task(1);

            memory.allocate(task);
            assertFalse(memory.allocate(task));
        }
    }

    @Nested
    @DisplayName("release()")
    class Release {
        // TODO: Write tests
    }
}