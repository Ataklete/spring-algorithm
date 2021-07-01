import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleMatch {
    public static long doubleSize(List<Integer> arr, int b) {
        b = b * arr.get(0);
        for (int i = 1; i < arr.size(); i++)
            if (b == arr.get(i))
                b += arr.get(i);

        return b;
    }

    public static long doubleSize2(List<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) == k)
                k *= 2;

        return k;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 4, 11, 12, 8};
        List<Integer> arr = Arrays.asList(a);
        System.out.println(doubleSize(arr, 2));
        System.out.println(doubleSize(arr, 2));
    }
}
