package com.company;

public class Fish {
    int age;
    String color;

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if (age<=0){
        System.out.println("Age must be more 0 and not equal 0");
        return;
    }
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
