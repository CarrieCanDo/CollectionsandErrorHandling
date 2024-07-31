package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Define a List of integers with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate
        numbers.add(4);
        numbers.add(5);
        numbers.add(3); // Duplicate

        // Print the original list
        System.out.println("Original list of numbers: " + numbers);

        // Use a Set to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Convert the Set back to a List if needed
        List<Integer> numbersWithoutDuplicates = new ArrayList<>(uniqueNumbers);

        // Print the list without duplicates
        System.out.println("List of numbers without duplicates: " + numbersWithoutDuplicates);

        // Calculate the sum and average
        try {
            int sum = 0;
            for (int number : numbersWithoutDuplicates) {
                sum += number;
            }
            double average = (double) sum / numbersWithoutDuplicates.size();

            // Print the sum and average
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Calculation completed.");
        }

        // IndexOutOfBoundsException
        try {
            System.out.println("Accessing an element out of bounds: " + numbersWithoutDuplicates.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }
}
