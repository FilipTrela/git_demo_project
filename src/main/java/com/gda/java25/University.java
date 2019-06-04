package com.gda.java25;

import java.util.Collection;
import java.util.Map;

public class University {
    Map<Long, Student> studentMap;

    public void addStudent(long indexNumber, String name, String surname) {
        Student student = new Student(indexNumber, name, surname);
        studentMap.put(indexNumber, student);
    }

    public boolean constainsStudent(long indexNumber) {
        if (studentMap.containsKey(indexNumber)) {
            return true;
        }
        return false;
    }

    public Student getStudent(long indexNumber) {
        Student student = new Student();
        if (studentMap.containsKey(indexNumber)) {
            student = studentMap.get(indexNumber);
        } else {
            student = null;
            System.err.println("Zły numer indeksu");
        }
        return student;
    }

    public int studentCount() {
        return studentMap.size();
    }
    public void printAllStudent(){
        Collection<Student> students = studentMap.values();
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
