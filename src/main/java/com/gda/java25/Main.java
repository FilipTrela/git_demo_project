package com.gda.java25;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(100300l, "Filip", "Trela");
        Student student2 = new Student(100100l, "Marta", "Obdarta");
        Student student3 = new Student(100200l, "Dominik", "Nowak");
        Student student4 = new Student(100400l, "Andrzej", "Lewanowski");
        Map<Long, Student> studentMap = new HashMap<Long, Student>();
        studentMap.put(student1.getNumerIndeksu(), student1);
        studentMap.put(student2.getNumerIndeksu(), student2);
        studentMap.put(student3.getNumerIndeksu(), student3);
        studentMap.put(student4.getNumerIndeksu(), student4);
        System.out.println(studentMap.containsKey(100200l));
        Student studentDoWypisania = studentMap.get(100300l);
        System.out.println(studentDoWypisania.toString());
        System.out.println(studentMap.size());
        Collection<Student> students = studentMap.values();
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Map<Long,Student> studentMap2 = new TreeMap<Long, Student>(studentMap);

    }
}
