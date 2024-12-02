package com.example;

import java.util.HashMap;
import java.util.Map;

public class CompanyFileReader {
    private Map<Integer, String> employeeData;

    public CompanyFileReader() {
        employeeData = new HashMap<>();
        employeeData.put(1, "500 Employees");
    }

    public String getEmployeeCount(int companyId) {
        return employeeData.getOrDefault(companyId, "Unknown");
    }
}

