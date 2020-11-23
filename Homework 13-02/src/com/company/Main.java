package com.company;

public class Main {

    public static void main(String[] args) {
        Student Petrov = new Student();

        Petrov.fullName = "Petr Petrov";
        Petrov.age = 18;
        Petrov.averageMark = 4.4D;


        Student Ivanov = new Student();

        Ivanov.fullName = "Ivan Ivanov";
        Ivanov.age = 16;
        Ivanov.averageMark = 4.1D;


        Student Sidorov = new Student();

        Sidorov.fullName = "Maksim Sidorov";
        Sidorov.age = 19;
        Sidorov.averageMark = 5.0D;

        System.out.println(Petrov.fullName + "; age: " + Petrov.age + "; av.mark: " + Petrov.averageMark);
        System.out.println(Ivanov.fullName + "; age: " + Ivanov.age + "; av.mark: " + Ivanov.averageMark);
        System.out.println(Sidorov.fullName + "; age: " + Sidorov.age + "; av.mark: " + Sidorov.averageMark + "\n");



    // zadacha b.
        Laptop Lenovo = new Laptop();

        Lenovo.model = "Lenovo ThinkPad";
        Lenovo.color = "Black";
        Lenovo.releaseYear = 2019;
        Lenovo.RAM = 8;


        Laptop Acer = new Laptop();

        Acer.model = "Acer Aspire";
        Acer.color = "Gray";
        Acer.releaseYear = 2018;
        Acer.RAM = 16;


        Laptop MacBook = new Laptop();

        MacBook.model = "MacBook Air";
        MacBook.color = "Gold";
        MacBook.releaseYear = 2016;
        MacBook.RAM = 32;

        System.out.println(Lenovo.model + "; color: " + Lenovo.color + "; " + Lenovo.releaseYear + "; RAM: " + Lenovo.RAM);
        System.out.println(Acer.model + "; color: " + Acer.color + "; " + Acer.releaseYear + "; RAM: " + Acer.RAM);
        System.out.println(MacBook.model + "; color: " + MacBook.color + "; " + MacBook.releaseYear + "; RAM: " + MacBook.RAM);

    }
}
