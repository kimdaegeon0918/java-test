package com.miniquest;

public class Main {
    public static void main(String[] args){
        Adult adult1 = new Adult("carter",30,70,170);
        Cat cat1 = new Cat("nabi",5,10,30);
        Dog dog1 = new Dog("waldo",7,20,50);
        Child child1 = new Child("peter",10,40,150);

        adult1.hello();
        adult1.work();
        adult1.getWeight();
        adult1.eat();
        adult1.getWeight();

        cat1.hello();
        cat1.getWeight();
        cat1.eat();
        cat1.getWeight();
        cat1.jump();

        dog1.hello();
        dog1.run();
        dog1.getWeight();
        dog1.eat();
        dog1.getWeight();

        child1.hello();
        child1.play();
        child1.getWeight();
        child1.eat();
        child1.getWeight();
    }
}
