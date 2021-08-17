package CH5.privacyleaks;

public class Person {

    private String name;
    private Date born;
    private Date died;  //null indicates still alive.

    public Person(String initialName, Date birthDate, Date deathDate){
        if (consistent(birthDate, deathDate)){
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
        }
        else{
            System.out.println("Inconsistent dates.Aborting.");
            System.exit(0);
        }
    }

    public Person(Person original){
        if (original == null){
            System.out.println("Fatal error.");
            System.exit(0);
        }

        name = original.name;
        born = new Date(original.born);

        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    public String toString(){
        String diedString;
        if (died == null)
            diedString = "";
        else
            diedString = died.toString(); //This is toString method of the class Date.

        return (name + ", " + born + "-" + diedString);
    }



    private static boolean consistent(Date birthDate, Date deathDate){
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate)
                    || birthDate.equals(deathDate));
    }
}
