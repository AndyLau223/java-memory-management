package memory.management.gcanlysis;

import java.util.ArrayList;
import java.util.List;

public class ExampleAnalysis {

    public static List<String> stringList = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            stringList.add("String " + i);
            System.out.println(stringList.get(i));
        }
    }

}
