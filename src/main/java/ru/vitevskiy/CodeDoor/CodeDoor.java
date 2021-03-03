package ru.vitevskiy.CodeDoor;

import java.util.Arrays;

public class CodeDoor {

    /**
     * Дверь имеет публичные методы:
     * - открыть (возвращает true либо выбрасывает ваше кастомное исключение)
     * - опустить ручку
     * - отодвинуть засов
     * - ввести код на цифровом замке (принимает в себя строку, состоящую только из цифр)
     * - ввести код с помощью механического замка (принимает в себя Integer[] - последовательность цифр)
     *
     * По умолчанию дверь создается со всеми закрытыми замками.
     * Дверь открывается только при отодвинутом засове, опущеной ручке,
     * корректно введенном цифровом коде и механическом коде. Соответственно, класс двери должен как-то отслеживать состояния своих замков.
     */

    boolean isDoorOpen = false;
    int digitalCode;
    boolean isDigitalLockOpen = false;
    boolean isCloserOpen = false;
    boolean isDoorKnobTurned = false;
    int[] mechanicalCode;
    boolean isMechanicalLockOpen = false;

    public CodeDoor(int digitalCode, int[] mechanicalCode) {
        this.digitalCode = digitalCode;
        this.mechanicalCode = mechanicalCode;
    }

    public boolean openDoor() {
        return true;
    }

    public boolean turnDoorKnob() {
        return this.isDoorKnobTurned = true;
    }

    public boolean removeCloser() {
        return this.isCloserOpen = true;
    }

    public boolean enterDigitalCode(String digitalCode) {
        return (Integer.parseInt(digitalCode) == this.digitalCode);
    }
    public boolean enterMechanicalCode(int[] mechanicalCode) {
        return Arrays.equals(mechanicalCode, this.mechanicalCode);

    }

}
