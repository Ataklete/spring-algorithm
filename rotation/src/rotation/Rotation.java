package rotation;

import java.util.ArrayList;
import java.util.List;

public class Rotation {

    public void rot1(int[] arr) {

        System.out.println("--------------------");
        System.out.println("Second Option as we need");

//        int[] arrayList = new int[arr.length] ;
        for (int k = arr.length; k >= arr.length - 3; k--) {

//            arr[k] = arr[k];

            System.out.println(arr.toString());

        }

        for (int i = 0; i < arr.length - 3; i++) {
//            if(arr[i]> arr[i-1]){
//                arr[i]= i;
            System.out.println(arr);
            // }
//            System.out.println(arr);

        }
    }

    public int[] rot3(int[] arr) {
        return arr;
    }

    public void rot2(int[] arr1) {
        for (int i = arr1.length - 1; i >= arr1.length - 3; i--) {

            System.out.println(arr1[i]);

            if (i == arr1.length - 3) {
                i = 0;

                for (int j = i; j < arr1.length - 3; j++) {
                    System.out.println(arr1[j]);
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Rotation{}";
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Rotation a = new Rotation();
        a.rot2(arr);

//        List<Integer> store =  new ArrayList<>();
//         store.add(a.rot2(arr);
//        a.rot1(arr);
//
//       int[] copy = new int[arr.length];
//
////       store.add(copy.clone());


    }
}


