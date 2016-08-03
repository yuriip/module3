package ua.goit.java.music;

import java.util.ArrayList;
import java.util.List;

public class MusicalShop {
    private String name;
    private String address;
    private List<MusicalInstrument> musicalInstruments;

    public MusicalShop(String name) {
        this.name = name;
        musicalInstruments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void addMusicalInstrument(MusicalInstrument musicalInstrument) {
        musicalInstruments.add(musicalInstrument);
    }

    public void listMusicalInstrument() {
        if (musicalInstruments != null) {
            for (MusicalInstrument m : musicalInstruments) {
                System.out.println(m.getName());
            }
        }
    }
}
