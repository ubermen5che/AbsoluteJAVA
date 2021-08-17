package CH5.privacyleaks;

import java.util.Scanner;

public class Date {

    private String month;
    private int day;
    private int year;

    public Date(String month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(Date aDate){
        if (aDate == null){
            System.out.println("Fatal Error");
            System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void writeOutput(){
        System.out.println(month + " " + day + ", " + year);
    }

    @Override
    public String toString() {
        return "DateSecondTry{" +
                "month='" + month + '\'' +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public void readInput(){
        boolean tryAgain =  true;
        Scanner keyboard = new Scanner(System.in);

        while(tryAgain){
            System.out.println("Enter month, day, and year");
            System.out.println("as three integers");
            System.out.println("Do not use a comma or other punctuations.");
            int monthInput = keyboard.nextInt();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if(dateOK(monthInput, dayInput, yearInput)){
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal date. Reenter input.");
        }
    }

    private boolean dateOK(int monthInput, int dayInput, int yearInput){
        return ((monthInput >= 1 && monthInput <= 12) && (dayInput >= 1 && dayInput <= 31)
                && (yearInput >= 1000 && yearInput <= 9999));
    }

    public void setDate(int monthInt, int dayInt, int yearInt){
        if (dateOK(monthInt, dayInt, yearInt)) {
            this.month = monthString(monthInt);
            this.day = dayInt;
            this.year = yearInt;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public int getMonth() {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equalsIgnoreCase("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equalsIgnoreCase("November"))
            return 11;
        else if (month.equalsIgnoreCase("December"))
            return 12;
        else {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }

    }

    private String monthString(int month) {
        if(month == 1)
            return "January";
        else if(month == 2)
            return "February";
        else if(month == 3)
            return "March";
        else if(month == 4)
            return "April";
        else if(month == 5)
            return "May";
        else if(month == 6)
            return "June";
        else if(month == 7)
            return "July";
        else if(month == 8)
            return "August";
        else if(month == 9)
            return "September";
        else if(month == 10)
            return "October";
        else if(month == 11)
            return "November";
        else if(month == 12)
            return "December";
        else{
            System.out.println("Fatal Error");
            System.exit(0);
            return "Error";
        }
    }

    public void setMonth(int monthNumber){

        if ((monthNumber < 0) || (monthNumber > 12)){
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.month = monthString(monthNumber);
    }

    public void setDay(int day) {

        if ((day <= 0) || (day > 31)){
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }

    public void setYear(int year) {

        if ((year < 1000) || (year > 9999)){
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Date otherDate){
        return ((month.equalsIgnoreCase(otherDate.month))
                && (day == otherDate.day) && (year == otherDate.year));
    }

    public boolean precedes(Date otherDate){
        return ( (year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth())
                || (year == otherDate.year && getMonth() == otherDate.getMonth() && day < otherDate.day));
    }
}
