package ua.goit.java.music;

public class Piano extends MusicalInstrument {
    public Piano(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играть на фортепиано");
    }

    @Override
    public void sound() {
        System.out.println("Звучит фортепиано");
    }
}
