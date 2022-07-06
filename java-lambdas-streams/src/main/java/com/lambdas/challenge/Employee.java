package com.lambdas.challenge;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearsOfService;
    private Employee manager;
    private int numberOfDirectReports;
    

    /**
     * @return Employee First Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the Employee First Name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Employee Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the Employee Last Name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Employee's Years of Service
     */
    public int getYearsOfService() {
        return yearsOfService;
    }

    /**
     * Sets Employee's Years of Service
     * @param yearsOfService
     */
    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    /**
     * @return Employee's Manager
     */
    public Employee getManager() {
        return manager;
    }

    /**
     * Sets Employee's Manager
     * @param manager
     */
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    /**
     * @return Employee's Number of Direct reports
     */
    public int getNumberOfDirectReports() {
        return numberOfDirectReports;
    }

    /**
     * Sets Employee's Number of Direct reports
     * @param numberOfDirectReports
     */
    public void setNumberOfDirectReports(int numberOfDirectReports) {
        this.numberOfDirectReports = numberOfDirectReports;
    }
}
