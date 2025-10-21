package com.directi.training.lsp.duck_exercice_refactored;

public class RealDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}