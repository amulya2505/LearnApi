package com.airtel.DTO;

import lombok.Data;
import java.util.List;

@Data
public class Employees {

    private List<Employee> employeesList;

    public static class Employee {
        private String firstName;
        private String lastName;
        private int employeeId;

    }
}

