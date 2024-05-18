package com.miniquest;

public class Child extends Human{
    public Child(String name, int age, double weight, double height){
        super(name,age,weight,height);
    }

    @Override
    public void eat(){
        this.weight += 0.7;
        System.out.println("어린이 "+this.name+" 몸무게 +0.7");
    }

    public void play(){
        System.out.println("어린이 "+this.name+"는 놉니다.");
    }

}
