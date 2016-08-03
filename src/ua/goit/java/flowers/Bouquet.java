package ua.goit.java.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private String name;
    private Flower flower;
    private int numFlower;
    private List<Flower> bouquet;


    public Bouquet(String name, Flower flower) {
        this.name = name;
        bouquet = new ArrayList<>(5);
        bouquet.add(flower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower getFlower(int index) {
        flower = bouquet.get(index);
        return flower;
    }

    public int getNumFlower() {
        numFlower = bouquet.size();
        return numFlower;
    }

    public void addFlower(Flower flower) {
        bouquet.add(flower);
    }

    public void listFlowers() {
        if (bouquet != null) {
            for (Flower f : bouquet) {
                System.out.println(f.getName() + " " + f.getColor());
            }
        }
    }
}
