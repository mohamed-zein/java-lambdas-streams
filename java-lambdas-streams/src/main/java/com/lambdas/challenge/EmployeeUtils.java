package com.lambdas.challenge;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    /**
     * @param employee
     * @return Employee's Full Name
     */
    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = e -> e.getFirstName() + " " + e.getLastName();
        
        return fullName.apply(employee);
    }

    /**
     * @param employee
     * @return Gets the last name of the Employee's manager
     */
    public String getManagersLastName(Employee employee) {
        Function<Employee, String> managersLastName = e -> e.getManager().getLastName() ;
        return managersLastName.apply(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has been employed more than 5 years
     */
    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = e -> e.getYearsOfService() > 5;
        return employedLongerThanFiveYears.test(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has more than 3 managers
     */
    public boolean hasMoreThanThreeDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = e -> e.getNumberOfDirectReports() > 3;
        return moreThanThreeDirectReports.test(employee);
    }

    /**
     * @param employee
     * @return True if the Employee has more than 3 years of service and less than 2 direct managers
     */
    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = e -> 
            (e.getYearsOfService() > 3) && (e.getNumberOfDirectReports() < 2) ;
        
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
