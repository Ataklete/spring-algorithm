package model;

import java.util.Comparator;

public class Order implements Comparator<Order> {

    private String name;
    private int age;

    public Order() {

    }

    public Order(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(Order o) {
//        return age-o.age;
//    }

    @Override
    public int compare(Order o1, Order o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age;
    }

    static int findSum(String str) {
        // A temporary string
        String temp = "";

        // holds sum of all numbers present in the string
        int sum = 0;
        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch) || ch == '-') {
                temp += ch;
                System.out.println(temp);
            }
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                int a = 0 + Integer.parseInt(temp);
                System.out.println("a " + a);
                sum += a;

                // reset temporary string to empty
//                temp = "";
            }
        }
        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        // input alphanumeric string
        String str = "30m-12abc20yz68";

        // Function call
        System.out.println(findSum(str));
    }


}
