package assignment1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class p2 {

    public static String sort(String s) {
        char[] list = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            list[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (list[j] > list[i]) {
                    char temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        String st = "";
        for (int i = 0; i < list.length; i++) {
            st += list[i];
        }
        return st;
    }

    public static int getMax(ArrayList<String> list) {
        String s;
        int count = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            s = list.get(0);
            count = 0;
            for (int j = 0; j < list.size();) {
                if (list.get(j).equals(s)) {
                    count++;
                    list.remove(list.get(j));
                } else {
                    j++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

//    public static int getMax(ArrayList<String> list) {
//        int max = 0;
//        ArrayList<String> table = new ArrayList();
//        for (int i = 0; i < list.size(); i++) {
//            String word = list.get(i);
//            if (table.contains(word) == false) {
//                int count=0;
//                table.add(word);
//                for (int j = 0; j < list.size(); j++) {
//                    if (list.get(j).equals(word)) {
//                        count++;
//                    }
//                }
//                if (count > max) {
//                    max = count;
//                }
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("anagram.in"));
        int n = inFile.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<String> list = new ArrayList();
            String s = inFile.next();
            while (s.charAt(0) != '-') {
                list.add(sort(s));
                s = inFile.next();
            }
            System.out.println(getMax(list));

        }
    }

}
