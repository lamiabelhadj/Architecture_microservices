package com.directi.training.lsp.duck_exercice_refactored;

public class ElectronicDuck {
    private boolean on = false;

    public void turnOn()  { on = true; }
    public void turnOff() { on = false; }
    public boolean isOn() { return on; }

    public void quack() {
        if (!on) throw new IllegalStateException("ElectronicDuck is OFF");
        System.out.println("Electronic duck quack...");
    }

    public void swim() {
        if (!on) throw new IllegalStateException("ElectronicDuck is OFF");
        System.out.println("Electronic duck swim");
    }
}

