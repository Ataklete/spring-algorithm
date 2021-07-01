import java.lang.reflect.Array;
import java.util.*;

public class ViewFormat {

    public String view(String str) {

        char[] c = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        ;

        for (int i = 0; i < c.length; i++) {
            //Checking weather the appear in the first or not
            if (!map.containsKey(c[i])) {
                map.put(c[i], 1);

            } else if (map.containsKey(c[i])) {
//               int temp = map.get(c[i]);

                for (Map.Entry<Character, Integer> a : map.entrySet())
//                   int temp = a.getValue();
                    map.put(c[i], a.getValue() + 1);

            }

        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() != 1) {
                sb.append(entry.getKey()).append(entry.getValue());
            } else {
                sb.append(entry.getKey());
            }

        }

        return sb.toString();

    }


    public void sorting(int[] s, int n) {

        Arrays.sort(s);

        for (int i = 0; i < n - 1; i += 2) {
            swap(s, i, i + 1);
            System.out.print(s[i] + " ");
        }

    }

    public void swap(int[] z, int i, int j) {

        int temp = z[i];
        z[i] = z[j];
        z[j] = temp;

    }

    public static void main(String[] arg) {
        ViewFormat vi = new ViewFormat();

        String st = "ahabcjahbdcjbjj";
        System.out.println(vi.view(st));

        int[] Arr = {5, 11, 43, 1, 2, 13, 7, 24, 18};
        vi.sorting(Arr, Arr.length);
    }
}
