import javafx.scene.control.TableColumn;

import java.util.*;

public class Test {

//    public int lengthOfLongestSubstring(String s) {
//        boolean[] exist = new boolean[256];
//        int i = 0, maxLen = 0;
//        for (int j = 0; j < s.length(); j++) {
//            while (exist[s.charAt(j)]) {
//                exist[s.charAt(i)] = false;
//                i++;
//            }
//            exist[s.charAt(j)] = true;
//            maxLen = Math.max(j - i + 1, maxLen);
//        }
//        return maxLen;
//    }

//    public int countCharacters(String[] words, String chars) {
//        char[] character = chars.toCharArray();
//
//        Arrays.sort(character);
//        int res = 0;
//        for(int i=0;i<words.length;i++)
//        {
//            char[] splitword = words[i].toCharArray();
//            Arrays.sort(splitword);
//            int counter = 0;
//
//            for(int j=0;j<character.length;j++)
//            {
//                if(character[j]==splitword[counter])
//                {
////                    while(counter<=2) {
//                        counter++;
////                        if (counter <= 2) {
////                            System.out.println(character[j]);
////                        }
//
//
//                }
//
//                if(counter==splitword.length)
//                    break;
//            }
//            if(counter==splitword.length)
//                res += counter;
//        }
//        return res;
//    }

    public int countCharacters(char[] chars , String name){
             StringBuilder str = new StringBuilder();
             char[] a = name.toCharArray();

        String b = "";
        for (int i=0; i<=name.length(); i++){

          if (chars[i]==a[i]){
              str=  str + chars[i];
            }
            System.out.println(b);
        }
        return count;
    }


    public static void main(String[] args) {
        String a = "Ataklete";
        char[] names = {'A','t','k'};
        Test ts = new Test();
//        System.out.println(ts.countCharacters(a, names));
//        System.out.println("------------------");
        System.out.println(ts.countCharacters(names, a));
    }

}
