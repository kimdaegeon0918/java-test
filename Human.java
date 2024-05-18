package com.miniquest;

public class Human extends Animal {
    public Human(String name, int age, double weight, double height){
        super(name,age,weight,height);
    }

    @Override
    public void eat(){
        this.weight += 2;
        System.out.println("인간 "+this.name+" 몸무게 +2");
    }

    @Override
    public void hello(){
        System.out.println("인간 "+this.name+"가 안녕이라 말합니다.");
    }

}
