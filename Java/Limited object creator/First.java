// WAP to count total number of objects created for that class without using for loop or any other iterative statement and restrict object creation if any threshhold value is reached.
// METHOD 1
import java.util.*;
public class First {
    private static int objectCount =  0;
    private static final int THRESHOLD =  5;
    public First() {
        if (objectCount < THRESHOLD) {
            objectCount++;
        } else {
            throw new RuntimeException("Object creation limit reached!");
        }
    }
    public static int getObjectCount() {
        return objectCount;
    }
    public static void main(String[] args) {
        try {
            First obj1 = new First();
            First obj2 = new First();
            First obj3 = new First();
            First obj4 = new First();
            First obj5 = new First();
            First obj6 = new First();
            First obj7 = new First();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total number of objects created: " + First.getObjectCount());
    }
}
