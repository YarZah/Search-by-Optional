package com.gmail.jarikzagreb16;

import javax.swing.*;
import java.util.Optional;

import static com.gmail.jarikzagreb16.Option.getElement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] arr = {20, 60, 15, 90, 46, 69, 26, 47, 124};

        Optional<Integer> existing = getElement(arr, 7);
        existing.ifPresentOrElse(value -> System.out.println("7 індекс =" + value),
                () -> System.out.println("7 індекс не знайдено."));
        Optional<Integer> missing = getElement(arr, 25);
        missing.ifPresentOrElse(value -> System.out.println("25 індекс =" + value),
                () -> System.out.println("25 індекс не знайдено."));
    }
}

