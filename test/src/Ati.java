import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Stream;

public class Ati {
    public static void main(String[] args) {

        Map<Integer, Object> h = new Hashtable();
        h.put(0, "ati");
        h.put(1,"haile");
        h.entrySet().forEach(a ->
                {
                    String b =a.getValue() + "Teffera";
                    System.out.println(a.getKey() + " " + a.getValue() + "->" + b);
                }
        );
        //----------------------------------
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("GFG", "Geeks",
                "for", "GeeksforGeeks");

        // Using forEach(Consumer action) to print
        // Character at index 1 in reverse order
        stream.sorted(Comparator.reverseOrder())
                .flatMap(str -> Stream.of(str.charAt(1)))
                .forEach(System.out::println);

        Checking c = new Checking() {
            @Override
            public void sample() {

            }
        };
    }
}
interface Checking{
    void sample();
}

