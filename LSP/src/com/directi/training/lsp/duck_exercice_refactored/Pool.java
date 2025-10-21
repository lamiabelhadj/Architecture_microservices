package com.directi.training.lsp.duck_exercice_refactored;


public class Pool {
    public void run() {
        Duck donald = new RealDuck();
        Duck robo  = new ElectronicDuckAdapter(new ElectronicDuck(), /*autoPowerOff*/ true);

        quack(donald, robo);
        swim(donald, robo);
    }

    private void quack(Duck... ducks) {
        for (Duck d : ducks) d.quack();
    }

    private void swim(Duck... ducks) {
        for (Duck d : ducks) d.swim();
    }

    public static void main(String[] args) {
        new Pool().run();
    }
}