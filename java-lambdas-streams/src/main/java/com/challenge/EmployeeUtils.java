package com.challenge;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    /**
     * @param employee
     * @return Employee's Full Name
     */
    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = null;
        return fullName.apply(employee);
    }

    /**
     * @param employee
     * @return Gets the last name of the Employee's manager
     */
    public String getManagersLastName(Employee employee) {
        Function<Employee, String> managersLastName = null;
        return managersLastName.apply(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has been employed more than 5 years
     */
    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = null;
        return employedLongerThanFiveYears.test(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has more than 3 managers
     */
    public boolean hasMoreThanThreeDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = null;
        return moreThanThreeDirectReports.test(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has more than 3 years of service and less than 2 direct managers
     */
    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = null;
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
