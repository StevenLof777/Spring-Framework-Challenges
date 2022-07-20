package com.genspark;

import java.util.List;

public class Student implements Print {
    public Student(int id, String name, Address add, List<Phone> ph) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.ph = ph;
    }

    private int id;
    private String name;
    private Address add;
    private List<Phone> ph;

    @Override
    public String toString() {
        return "Student {" +
                "\n\tid=" + id + "," +
                "\n\tname=" + name + "," +
                "\n\tadd=" + add + "," +
                "\n\tph=" + ph + "," +
                "\n}";
    }

    public void print() {
        System.out.println(this);
    }
}
