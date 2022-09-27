package com.company;

import java.util.Random;

public class Flower implements Comparable<Flower> {

    private static int countId = 1;
    private static int countFlower = 0;

    private final int id;
    private String name;
    private int price;
    private int freshness;
    private int length;

    private static final FlowerName[] flowersNames = FlowerName.values(); // A B C D E -> A.name() - Роза

    private static final Random random = new Random();

    public Flower() {
        this.id = countId;
        this.name = flowersNames[countFlower].getName(); // 0 1 2 3 4 -> 5
        countFlower++;
        if (countFlower == 5) {
            countFlower = 0;
        }
        countId++;
        this.price = 100 + random.nextInt(201);
        this.length = 40 + random.nextInt(50);
        this.freshness = 1 + random.nextInt(100);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getFreshness() {
        return freshness;
    }

    public void setFreshness(Integer freshness) {
        this.freshness = freshness;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }

    @Override
    public int compareTo(Flower o) {
        return o.getFreshness().compareTo(this.getFreshness());
    }
}



