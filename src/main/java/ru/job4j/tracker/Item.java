package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        setName(name);
    }

    public Item(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Item i = new Item(15, "Bob");
        Item ii = new Item("Milinda");
        i.printInfo();
        ii.printInfo();
    }
}