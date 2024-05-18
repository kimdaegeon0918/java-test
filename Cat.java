package com.miniquest;

public class Cat extends Animal{
    public Cat(String name, int age, double weight, double height){
        super(name,age,weight,height);
    }

    @Override
    public void eat(){
        this.weight += 0.5;
        System.out.println("고양이 "+this.name+" 몸무게 +0.5");
    }

    @Override
    public void hello(){
        System.out.println("고양이 "+this.name+"가 야옹! 인사합니다.");
    }

    public void jump(){
        System.out.println("고양이 "+this.name+" 점프!");
    }

}
