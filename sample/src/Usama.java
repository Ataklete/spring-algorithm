import java.util.ArrayList;
import java.util.List;

public class Usama {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        List<Integer> res = new ArrayList<>();
        int counter = 0;
        int sum = 0;
        int len = arr.length - 1;

        res.add(arr[0]);
        int start = 1;
        int j = 0;
        for (int i = start + 1; i < len; i++) {
            sum = arr[i];
            counter = i + i;
            if (counter < len) {
                for (j = i; j < counter; j++) {
                    sum += arr[j];

                }
                res.add(sum);
                counter = 0;
                start = j;
            }
        }
        System.out.println(res);

    }
}


