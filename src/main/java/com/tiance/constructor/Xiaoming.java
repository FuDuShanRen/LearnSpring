package com.tiance.constructor;

public class Xiaoming implements Person{
    private Axe axe;

    public Xiaoming(Axe axe){
        this.axe=axe;
    }

    public void useAxe() {
        System.out.println(axe.chop());
    }
}
