package com.miniquest;

public class Animal {
    String name;
    int age;
    double weight;
    double height;

    public Animal(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void eat(){
        this.weight += 1;
    }

    public void getWeight(){
        System.out.println(this.name+" 현재 몸무게는 "+this.weight);
    }

    public void hello(){
        System.out.println("hello");
    }

}
