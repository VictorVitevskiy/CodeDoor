package ru.vitevskiy.CodeDoor;

import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void testConstructor() {
        CodeDoor codeDoor = new CodeDoor(12345, new int[] {5,4,3,2,1});

        if (codeDoor == null) {
            throw new RuntimeException("Test filed");
        }
    }

    @Test
    void testDigitalLockOpensCorrectly() {
        CodeDoor codeDoor = new CodeDoor(12345, new int[] {5,4,3,2,1});
        if (!codeDoor.enterDigitalCode("12345")) {
            throw new RuntimeException("Test filed");
        }
    }
}
