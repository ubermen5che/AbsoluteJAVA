package CH7.employee;

import CH5.privacyleaks.Date;

public class HourlyEmployeeDemo {

    public static void main(String[] args) {
        HourlyEmployee joe = new HourlyEmployee();
        joe.setName("joe");
        joe.setHireDate(new Date("January", 1, 1000));

        System.out.println("joe = " + joe);
    }
}
