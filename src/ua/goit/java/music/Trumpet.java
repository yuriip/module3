package ua.goit.java.music;

public class Trumpet extends MusicalInstrument {
    public Trumpet(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играть на трубе");
    }

    @Override
    public void sound() {
        System.out.println("Звучит труба");
    }
}
