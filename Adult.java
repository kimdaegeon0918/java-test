package com.miniquest;

public class Adult extends Human{
    public Adult(String name, int age, double weight, double height){
        super(name,age,weight,height);
    }

    @Override
    public void eat(){
        this.height += 1;
        System.out.println("어른 "+this.name+" 몸무게 +1");
    }

    public void work(){
        System.out.println("어른 "+this.name+"는 일을 합니다.");
    }

}