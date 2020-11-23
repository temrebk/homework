package com.company;

public class Cat {
    String name;
    int age;
    String color;

    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if (age<=0){
            System.out.println("Incorrect enter");
            return;
        }
        this.age = age;
    }
    public void setColor(String c) {
        color = c;
    }
}
