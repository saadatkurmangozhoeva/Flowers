package com.company;

public enum FlowerName {

    A("Роза"),
    B("Гипсофилы"),
    C("Тюльпан"),
    D("Ромашка"),
    E("Пионы");

    private final String name;

    FlowerName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(FlowerName.values()[0].name());
    }

}
