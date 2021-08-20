package CH7.employee;

import CH5.privacyleaks.Date;

public class Employee {

    private String name;
    private Date hireDate;

    public Employee(){
        name = "No name";
        hireDate = new Date("January", 1, 1000);
    }

    /**
     * Precondition: Neither theName nor theDate is null.
     */

    public Employee(String theName, Date theDate){
        if (theName == null || theDate == null){
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject){
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);   //copy constructor
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Precondition: newName is not null.
     */

    public void setName(String newName){
        if (newName == null){
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        }else {
            name = newName;
        }
    }

    public void setHireDate(Date newDate){
        if (newDate == null){
            System.out.println("Fatal error setting employee hire " + "date.");
            System.exit(0);
        }else {
            hireDate = new Date(newDate);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    public boolean equals(Employee otherEmployee){
        return (name.equals(otherEmployee.name) &&
                hireDate.equals(otherEmployee.hireDate));
    }
}
