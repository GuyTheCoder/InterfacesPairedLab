package model;

import model.interfaces.*;

public abstract class Seal implements IFlee, ISleep, IEat, IAnimal, ISwim, IPrey {

    @Override
    public void eat() {
        System.out.println("Seal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Seal is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Seal is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Seal is fleeing from a predator");
    }
}
