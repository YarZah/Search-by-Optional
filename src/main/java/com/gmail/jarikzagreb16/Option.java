package com.gmail.jarikzagreb16;

import java.util.Optional;

public class Option {
    public static Optional<Integer> getElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return Optional.of(array[index]);
        }
        return Optional.empty();
    }
}
