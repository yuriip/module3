package ua.goit.java.flowers;

import java.util.ArrayList;
import java.util.List;

public abstract class Bush<T> {
    private String name;
    private T flower;
    private int numFlower;
    protected List<T> bush;

    public Bush(String name) {
        this.name = name;
        bush = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getFlower(int index) {
        flower = bush.get(index);
        return flower;
    }

    public int getNumFlower() {
        numFlower = bush.size();
        return numFlower;
    }

    public void addFlower(T flower) {
        bush.add(flower);
    }

    public void grow() {
        System.out.println("Куст растет");
    }

    public abstract void formed();
}
