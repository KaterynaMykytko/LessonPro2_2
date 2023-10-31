package org.courses.ex2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyCollection {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Hello");
        list1.add("my");
        list1.add("friends");
        List<String> list2 = doubleValue(list1);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public static List<String> doubleValue(List<String> list1) {
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(list1);
        Collections.sort(list2);
        return list2;
    }
}