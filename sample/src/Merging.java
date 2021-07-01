import model.Order;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merging {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 111);
        map.put(2, 111);
        map.put(3, 2);
        map.merge(3, 333, (v1, v2) -> v1 + v2);
        System.out.println(map);

        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(000);

        List<Integer> a = list.stream().distinct().collect(Collectors.toList());
        System.out.println(a);
        List<Integer> b = list.stream().sorted().collect(Collectors.toList());
        System.out.println(b);

        List<Order> list1 = new ArrayList<Order>();
        list1.add(new Order("Henok", 35));
        list1.add(new Order("saba", 45));
        list1.add(new Order("Helen", 30));
        list1.add(new Order("Ati", 37));

        Order nameComp = new Order();

        Collections.sort(list1, nameComp);
        System.out.println("-----");
        System.out.println(list1);
        System.out.println("======");
        List<Order> streams = list1.stream().sorted(Comparator.comparing(Order::getAge)).collect(Collectors.toList());
        System.out.println(streams);

        List<String> level = new ArrayList<>();
        List<Button> buttons = level.stream().map(Button::new).collect(Collectors.toList());
        System.out.println("//////////");
        System.out.println(buttons);

        Merging mer = new Merging();
        System.out.println("To test the output of no arg: ");
        System.out.println(mer.getClass().getName());

        int[][] arr = {{6, 20, 5, 30, 5}, {20, 2, 30, 9}, {2}, {30, 6}};
        List<Integer> dup = new ArrayList<>();
        List<Integer> set = new ArrayList<>();


        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                for (int m = 0; m < arr.length; m++) {
                    for (int k = j + 1; k < arr[m].length; k++) {
//                        System.out.println("** "+ arr[m][k] );
                        if (temp == arr[m][k]) {
                            dup.add(temp);
                            //break;
                        }
                    }
//                    if (arr[i][j] == arr[i][m]) {
//                        dup.add(arr[i][m]);
//                    }
                }

            }
        }
        System.out.println("\n dup ---------");
        System.out.println(dup);
//        System.out.println("\n set ---------");
//        System.out.println(set);

        //Second min or max-------------------------------------------------
        int ar[] = {70, 4, 8, 10, 14, 9, 7, 6, 5, 3, 2};
        int le = ar.length;

        //Initialize
        int max = ar[0];
        int second_max = 0;

        for (int i = 0; i < le; i++) {


            if (ar[i] > max) {

                second_max = max;
                max = ar[i];
            }

            if (max > ar[i] && ar[i] > second_max) {
                second_max = ar[i];
            }
        }


        System.out.println("Second highest element is %d " + second_max);

        //------------------------
        Stream<Integer> arrays = Stream.of(70, 4, 8, 10, 14, 9, 7, 6, 5, 3, 2);
        List<Integer> giveMe = arrays.distinct().collect(Collectors.toList());
        Collections.sort(giveMe);
        System.out.println("new output " + giveMe.get(1));
        //--------------------------

        List<Integer> set1 = new ArrayList<>();
        for (Integer in : ar) {
            set1.add(in);
        }
        List<Integer> set2 = set1.stream().distinct().collect(Collectors.toList());
        Collections.sort(set2);
        System.out.println("from list sorted " + set2.get(set2.size() - 2));

//        System.out.println("sorted "+ set1);


//----------------------------------------------------------------------------
        // group the same element and count----------------------
        List<Integer> stream = new ArrayList<>(Arrays.asList(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34));
//                = Stream.of(5, 13, 4,
//                21, 13, 27,
//                2, 59, 59, 34);
        System.out.println("count duplicate names " + stream.stream().collect(
//        System.out.println(stream.collect(
                Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                        .entrySet()
                        .stream()

                        // Check if frequency > 1
                        // for duplicate elements
                        .filter(m -> m.getValue() > 1)

                        // Find such elements
//                .map(Map.Entry::getKey)

                        // And Collect them in a Set
                        .collect(Collectors.toList())
        );

//        ------------------------------------------------------------------------
        List<String> test = new ArrayList<>(Arrays.asList("john", "john", "simth", "don", "don"));
        Set<String> store = test.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)

//                .filter(i -> Collections.frequency(test, i) > 1)

                // And Collect them in a Set
                .collect(Collectors.toSet());
        System.out.println("Names of  duplicate " + store);
        //------------------------------------------------------------------------
        List<String> str1 = Arrays.asList("a", "b", "c", "d");

        List<String> str2 = new ArrayList<>();
        str2.add("a");
        str2.add("b");

        List<String> newStr = new LinkedList<>();

        for (int i = 0; i < str1.size(); i++) {
            String s = str1.get(i);


            for (int j = 0; j < str2.size(); j++) {
                if (s.contains(str2.get(j))) {
                    newStr.add(s);
                    break;
                }
            }
        }
        System.out.println("---> " + newStr);


        List<String> duplucate = str1.stream().distinct().collect(Collectors.toList());
        int i = 0;
        List<String> nonDup = str1.stream().filter(x -> x.contains(str2.stream().reduce("", (s, j) -> s + "," + j).substring(1)))
                .collect(Collectors.toList());

        System.out.println("222---> " + nonDup);
//                 nonDup.forEach(System.out::println);
//               List<String> st = str1.stream().filter(x->x.equalsIgnoreCase(str2)).anyMatch(x);


    }
}
