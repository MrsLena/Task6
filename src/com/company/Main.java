package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Дана  map <Character, Set<String>> где значение – список строк начинающихся на букву, которая является ключом.
        Увы, исходный map содержи ошибки. Несколько строк записаны в неправильные ключи. Написать метод, который скорректирует map.*/

        Map<String, Set<String>> map = new HashMap<>();
        map.put("a", addelement("a"));
        map.put("b", addelement("b"));



        for (Map.Entry e: map.entrySet()) {
            String FirstSymbol = String.valueOf(e.getKey());
            System.out.println(FirstSymbol);

            Set<String> rez = (Set<String>) e.getValue();
            Iterator<String> rezIterator = rez.iterator();
            while (rezIterator.hasNext()) {
                String tek = rezIterator.next();
                if (tek.charAt(0)!=FirstSymbol.charAt(0)) {
                    rezIterator.remove();
                }

            }
            e.setValue(rez);
        }

        for (Map.Entry e: map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }



    public static Set addelement(String aa) {
        Set<String> rez = new HashSet<>();
        rez.add(aa+"111111");
        rez.add(aa+"22222");
        rez.add("z99999");
        rez.add("a88888");
        return rez;
    }
}
