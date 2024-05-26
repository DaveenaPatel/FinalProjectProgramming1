package org.example;

import lombok.ToString;

import java.util.Random;

@ToString
public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private int[] scores;
    private static int nextId;

    /**
     * calculates the average
     *
     * @param numerator   the numerator
     * @param denominator the denominator
     * @return the average
     */
    public static int calcAssignment(int numerator, int denominator) {
        int average = numerator / denominator * 100;
        return average;
    }

    /**
     * Generates random number for an assignment
     */
    public static void generateRandomScore() {
        Random rand = new Random();
        int randomNum = rand.nextInt(0, 11);
        switch (randomNum) {
            case 0 -> rand.nextInt(0, 60);
            case 1, 2 -> rand.nextInt(60, 70);
            case 3, 4 -> rand.nextInt(70, 80);
            case 5, 6, 7, 8 -> rand.nextInt(80, 90);
            case 9, 10 -> rand.nextInt(90, 100);
        }
    }
}
