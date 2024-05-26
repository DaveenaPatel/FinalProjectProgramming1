package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private String[] course;
    private static int nextId;

//    /**
//     * registers a course
//     * @param course the course
//     * @return return true if course is registered, return false if course is not registered
//     */
//    public static boolean registerCourse(Course course ){
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    /**
//     * drops a course
//     * @param course the course
//     * @return if the course is not registered return false, if the course is register return true
//     */
//    private static boolean dropCourse(Course course){
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

    public Student(String studentId, String studentName, Gender gender, Address address, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
    }

//    /**
//     * Simplifies to a String with studentId, studentName, departmentName
//     * @param studentId the studentId
//     * @param studentName the studentName
//     * @param departmentName the departmentNAme
//     * @return A String with studentId, studentName, departmentName
//     */
//    private static String toSimplifiedString(String studentId, String studentName, Department departmentName){
//
//    }
}
