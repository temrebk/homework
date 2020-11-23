package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача А. Попугаи
        Parrot red = new Parrot();
        red.setName("Kesha");
        red.setAge(1);
        red.setColor("red");

        Parrot blue = new Parrot();
        blue.setName("Rio");
        blue.setAge(2);
        blue.setColor("blue");

        System.out.println("Parrot: " + red.name + ", " + red.getAge() + " y.o., " + red.color);
        System.out.println("Parrot: " + blue.name + ", " + blue.getAge() + " y.o., " + blue.color);

        // собаки
        Dog akita = new Dog();
        akita.setName("Hatiko");
        akita.setAge(5);
        akita.setColor("white");

        Dog terrier = new Dog();
        terrier.setName("Churchill");
        terrier.setAge(4);
        terrier.setColor("brown");

        System.out.println("Dog: " + akita.name + ", " + akita.getAge() + " y.o., " + akita.color);
        System.out.println("Dog: " + terrier.name + ", " + terrier.getAge() + " y.o., " + terrier.color);

        // кошки
        Cat newBreed = new Cat();
        newBreed.setName("Molly");
        newBreed.setAge(1);
        newBreed.setColor("black");

        Cat oldBreed = new Cat();
        oldBreed.setName("Barsik");
        oldBreed.setAge(8);
        oldBreed.setColor("brown and white");

        System.out.println("Cat: " + newBreed.name + ", " + newBreed.getAge() + " y.o., " + newBreed.color);
        System.out.println("Cat: " + oldBreed.name + ", " + oldBreed.getAge() + " y.o., " + oldBreed.color);

        // рыбки
        Fish guppies = new Fish();
        guppies.setAge(2);
        guppies.setColor("black");

        Fish catfish = new Fish();
        catfish.setAge(0);
        catfish.setColor("dark brown");

        System.out.println("Guppies: " + guppies.getAge() + " y.o., " + guppies.color);
        System.out.println("Catfish: " + catfish.getAge() + " y.o., " + catfish.color);
    }
}
