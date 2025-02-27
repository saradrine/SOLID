package com.directi.training.lsp.exercice_refactored;

public class Duck implements Quackable, Swimmable {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}
