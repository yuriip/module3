package ua.goit.java.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final static int maxNumFlowers = 5;

    private String name;
    private int numFlowers;
    private List<Flower> bouquet;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        bouquet = new ArrayList<>(maxNumFlowers);
        bouquet.add(flower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower getFlower(int index) {
        return bouquet.get(index);
    }

    public int getNumFlowers() {
        return bouquet.size();
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
