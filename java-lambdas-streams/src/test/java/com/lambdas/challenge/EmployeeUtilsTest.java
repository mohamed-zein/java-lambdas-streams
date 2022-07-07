package com.lambdas.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmployeeUtilsTest {

    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    public void testGetFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");
        
        String actual = employeeUtils.getFullName(employee);
        assertEquals("Jerome Donaldson", actual);
    }

    @Test
    public void testGetManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);
        assertEquals("Westbay", actual);
    }

    @Test
    public void testHasBeenEmployedLongerThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearsOfService(20);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        assertTrue(actual);
    }

    @Test
    public void testHasMoreThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertTrue(actual);
    }

    @Test
    public void testHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(5);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertTrue(actual);
    }
}
