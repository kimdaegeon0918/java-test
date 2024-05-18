package com.miniquest;

public class Dog extends Animal {
    public Dog(String name, int age, double weight, double height){
        super(name,age,weight,height);
    }

    @Override
    public void eat(){
        this.weight += 1.3;
        System.out.println("개 "+this.name+" 몸무게 +1.3");
    }

    @Override
    public void hello(){
        System.out.println("개 "+this.name+"가 왈왈! 인사합니다.");
    }

    public void run(){
        System.out.println("개 "+this.name+"는 뜁니다.");
    }
}
