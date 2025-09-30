package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        System.out.println("There is gav's food and name.");
        Cat gav = new Cat();
        gav.name = "Gav";
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black's food and name.");
        Cat black = new Cat();
        black.name = "Black";
        black.eat("fish");
        black.show();
    }
}
