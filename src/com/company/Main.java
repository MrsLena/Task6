package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Дана  map <Character, Set<String>> где значение – список строк начинающихся на букву, которая является ключом.
        Увы, исходный map содержи ошибки. Несколько строк записаны в неправильные ключи. Написать метод, который скорректирует map.*/

        Map<String, Set<String>> map = new HashMap<>();
        map.put("a", addelement("a"));
        map.put("b", addelement("b"));
        map.put("с", addelement("с"));

        //сreate list all elements
        Set<String> listelements = new TreeSet<>();

        for (Map.Entry e: map.entrySet()) {
           Set<String> rez = (Set<String>) e.getValue();
           listelements.addAll(rez);
        }


        for (Map.Entry e: map.entrySet()) {
            String FirstSymbol = String.valueOf(e.getKey());
            List<String> newSp = new ArrayList<>();

            for (String d:   listelements    ) {
                if (d.charAt(0)==FirstSymbol.charAt(0)) {
                    newSp.add(d);
                }
            }

            e.setValue(newSp);

            System.out.println("для ключа " + e.getKey() + " элементы: " + e.getValue());
        }

    }



    public static Set addelement(String aa) {
        Set<String> rez = new HashSet<>();
        rez.add(aa+"111111");
        rez.add(aa+"22222");
        rez.add("b9999");
        rez.add("с5555");
        rez.add("b0000");
        rez.add("a8888");
        return rez;
    }
}
