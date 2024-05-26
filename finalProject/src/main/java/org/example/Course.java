package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private Assignment[] assignments;
    private Student[] registeredStudents;
    private double[] finalScores;
    private static int nextId;

    /**
     * Chechks if weighted average equals 1
     *
     * @param weight the weight
     * @return true if weighted average equals 1, false if weighted average equals something else
     */
    public static boolean isAssignmentValid(double weight) {
        if (weight == 1) {
            return true;
        } else {
            return false;
        }
    }

//    /**
//     * Adds student to student list
//     * @param student the student
//     * @return registered student to s list
//     */
//    public static boolean registerStudent(Student student){
//
//    }

//    /**
//     * Calculates the weighted average
//     * @return the weighted average for a student
//     */
//    public static int[] calcStudentsAverage(){
//
//    }

//    /**
//     * Adds assignment to a course
//     * @param assignmentName the assignment Name
//     * @param weight the weight
//     * @param maxScore the maxScore
//     * @return the addded assignment to the course
//     */
//    public static boolean addAssignment(String assignmentName, double weight, int maxScore){
//
//    }

    /**
     * Generates random number for assignment and student
     */
    public static void generateScores() {
        Random rand = new Random();
        int randomAssignmentScore = rand.nextInt(0, 101);
        int randomStudentNum = rand.nextInt();
    }

    /**
     * The display of the course for a student
     */
    public static void displayScores() {

    }

//    /**
//     * changes course to a simplified string
//     * @param courseId the courseId
//     * @param courseName the courseName
//     * @param departmentName the departmentName
//     * @param assignments the assignments
//     * @param studentId the studentId
//     * @param studentName the studentName
//     * @return the simplified string
//     */
//    public static String toSimplifiedString(String courseId, String courseName, Department departmentName,
//                                            Assignment assignments, String studentId, String studentName){
//
//    }
}
