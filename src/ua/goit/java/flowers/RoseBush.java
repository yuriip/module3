package ua.goit.java.flowers;

import java.util.ArrayList;

public class RoseBush extends Bush {
    public RoseBush(String name) {
        super(name);
        super.bush = new ArrayList<RoseFlower>(3);
    }

    @Override
    public void formed() {
        System.out.println("Розовый куст формируется с колючками");
    }
}
