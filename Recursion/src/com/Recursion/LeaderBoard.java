package com.Recursion;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks == o.marks) {
            return this.name.compareTo(o.name);
        }
        return o.marks - this.marks;
    }
}

public class LeaderBoard {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("John", 50);
        studentMap.put("Jane", 60);
        studentMap.put("Bob", 50);
        studentMap.put("Alice", 70);
        studentMap.put("Eve", 60);

        List<Student> students = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            students.add(new Student(entry.getKey(), entry.getValue()));
        }
        Collections.sort(students);

        int rank = 1;
        for (int i = 0; i < students.size(); i++) {
            if (i > 0 && students.get(i).marks != students.get(i - 1).marks) {
                rank = i + 1;
            }
            System.out.println( rank + " " +students.get(i).name);
        }
    }
}

