package ua.goit.java.flowers;

import java.util.ArrayList;

public class RoseBush extends Bush {
    private final static int maxNumFlowers = 3;

    public RoseBush(String name) {
        super(name);
        bush = new ArrayList<RoseFlower>(maxNumFlowers);
    }

    @Override
    public void formed() {
        System.out.println("Розовый куст формируется с колючками");
    }
}
