package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId;

    /**
     * Checks if department Name is valid
     *
     * @param departmentName the department name
     * @return true if department name valid, false if department name not valid
     */
    public static boolean validDepartmentName(String departmentName) {
        if (departmentName == null) {
            return false;
        }

        if (departmentName.contains(" ")) {
            return true;
        } else {
            return false;
        }

    }

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
}
