package model;

import model.interfaces.*;

public abstract class Puffin implements IFlee, ISleep, IEat, IAnimal, IFly, ISwim, IPrey {
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from predator");
    }



    }

