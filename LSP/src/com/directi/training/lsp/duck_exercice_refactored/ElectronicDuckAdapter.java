package com.directi.training.lsp.duck_exercice_refactored;

public class ElectronicDuckAdapter implements Duck {
    private final ElectronicDuck device;
    private final boolean autoPowerOff;

    public ElectronicDuckAdapter(ElectronicDuck device) {
        this(device, false);
    }

    public ElectronicDuckAdapter(ElectronicDuck device, boolean autoPowerOff) {
        this.device = device;
        this.autoPowerOff = autoPowerOff;
    }

    @Override
    public void quack() {
        ensureOn();
        device.quack();
        maybeOff();
    }

    @Override
    public void swim() {
        ensureOn();
        device.swim();
        maybeOff();
    }

    private void ensureOn() {
        if (!device.isOn()) device.turnOn();
    }

    private void maybeOff() {
        if (autoPowerOff) device.turnOff();
    }
}