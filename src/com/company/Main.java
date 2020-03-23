package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Ivan",3));
        students.add(new Student("Petr",4));
        students.add(new Student("Alex",1));
        students.add(new Student("Max",2));
        students.add(new Student("Olga",5));

        for(Student s: students) {
            System.out.println("mark: "+s.getMark() + "; name:"+s.getName());
        }


        //students.subSet(); - подмножества
        //students.tailSet(); - с объекта и до конца
        // students.headSet(); - c начала и до объекта

        SortedSet<Student> result = students.tailSet(new Student("",4));
System.out.println(result);



    }
}
