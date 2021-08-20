package CH7.employee;

import CH5.privacyleaks.Date;

public class HourlyEmployee extends Employee{

    private double wageRate;
    private double hours;

    public HourlyEmployee(){
        super();
        wageRate = 0;
        hours = 0;
    }

    public HourlyEmployee(String theName, Date theDate,
                          double theWageRate, double theHours){
        super(theName, theDate);    //여기서 왜 theDate는 reference로 넘기는걸까? -> superclass 생성자에서 new해서 생성하기때문.
        if ((theWageRate >= 0) && (theHours >= 0)){
            wageRate = theWageRate;
            hours = theHours;
        }else{
            System.out.println("Fatal error: creating an illegal hourly employee.");
            System.exit(0);
        }
    }

    public HourlyEmployee(HourlyEmployee originalObject){
        super(originalObject);
        wageRate = originalObject.wageRate;
        hours = originalObject.hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getPay(){
        return wageRate * hours;
    }

    public void setHours(double hoursWorked){
        if (hoursWorked >= 0)
            hours = hoursWorked;
        else{
            System.out.println("Fatal error: Negative hours worked.");
            System.exit(0);
        }
    }

    public void setWageRate(double newWageRate){
        if (newWageRate >= 0)
            wageRate = newWageRate;
        else{
            System.out.println("Fatal error: Negative wage rate.");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wageRate=" + wageRate +
                ", hours=" + hours +
                '}';
    }

    public boolean equals(HourlyEmployee other){
        return (getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()) &&
                wageRate == other.wageRate &&
                hours == other.hours);
    }
}
