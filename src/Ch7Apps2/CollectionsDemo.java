/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch7Apps2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aashgar
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
//        List<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(60);
        list1.add(7);
        list1.add(3);
        list1.add(3, 33);

//        list1.remove(2);
//        System.out.println(list1);
//        Integer sum = 0;
//        for(int i=0; i< list1.size(); i++)
//            sum+= list1.get(i);
//        for(Integer integer: list1)
//            sum+= integer;

//        Iterator<Integer> iterator = list1.iterator();
//        while(iterator.hasNext())
//            sum+= iterator.next();
//        ListIterator<Integer> iterator = list1.listIterator();
//        while(iterator.hasNext())
//            sum+= iterator.next();
//        
//        System.out.println(list1+ " with sum= "+sum);
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(60);
        set1.add(7);
        set1.add(3);
        set1.add(7);
        set1.add(60);
//        System.out.println(set1);
//        for (Integer integer : set1) {
//            sum += integer;
//        }
//
//        System.out.println(set1 + " with sum= " + sum);
//        Map<String, Integer> grades = new HashMap<>();
//        grades.put("Prog2", 90);
//        grades.put("Digital Design",66);
//        grades.put("English", 88);
//        grades.put("Stats", 100);
//        System.out.println(grades);
//        Integer sum = 0;
//        for(String course: grades.keySet())
//            sum+= grades.get(course);
//        System.out.println("Average= " + sum/grades.size());

        CollectionProcessing<Integer> cp = new CollectionProcessing<>();
        System.out.println("Show the list .....");
        cp.show(list1);
        System.out.println("Show the set .....");
         cp.show(set1);
        
         List<String> list2 = new LinkedList<>();
         list2.addAll(Arrays.asList("Ahmad","Ali","Mosa"));
         CollectionProcessing<String> cp1 = new CollectionProcessing<>();
         cp1.show(list2);
    }
}
