package memory.management.memoryleak;

import java.util.ArrayList;


/**
 * This example code is to demonstrate memory leak and how to diagnose the running code.
 * <p>
 * start application with command:
 * java -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./
 */
public class OutOfMemoryExample {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
//        this code will cause memory leak.
//        while (true) {
//            Person john = new Person("john");
//            people.add(john);
//        }

        int i =0;
        while (true) {
            Person john = new Person("john");
            people.add(john);
            if (i == 1000) {
//                This is crucial since it's removing the connection of old object from the stack
//                therefore, GC cal reclaim the old list.
                people = new ArrayList<>();
                i = 0;
            }
        }
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
}
