package CH5;

public class InvocationCounter {
    private static int numberOfInvocations = 0;

    public void demoMethod(){
        numberOfInvocations++; //object1 and object2 use the same static variable numberOfInvocations
    }

    public void outPutCount(){
        numberOfInvocations++;
        System.out.println("Number of invocations so far = " + numberOfInvocations);
    }

    public static int numberSoFar(){
        numberOfInvocations++;
        return numberOfInvocations;
    }

    public static void main(String[] args){
        int i;
        InvocationCounter object1 = new InvocationCounter();
        for (i = 1; i <= 5; i++)
            object1.demoMethod();
        object1.outPutCount();

        InvocationCounter object2 = new InvocationCounter();
        for (i = 1; i <= 5; i++) {
            object2.demoMethod();
            object2.outPutCount();
        }

        System.out.println("Totalnumber of invocations = " + numberSoFar());
    }
}
