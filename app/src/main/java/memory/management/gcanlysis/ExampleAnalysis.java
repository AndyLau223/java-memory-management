package memory.management.gcanlysis;

import java.util.ArrayList;
import java.util.List;

/**
 * This sample code is for the GC analysis.
 * Using VisualVM to grab the JVM metrics.
 *
 * You can launch the application with different heap size to
 * experiment what will happen when heap size running out of space  and
 * what would the GC activity look like.
 */
public class ExampleAnalysis {

    public static List<String> stringList = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            stringList.add("String " + i);
            System.out.println(stringList.get(i));
        }
    }

}
