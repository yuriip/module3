package ua.goit.java.music;

public class Guitar extends MusicalInstrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Играть на гитаре");
    }

    @Override
    public void sound() {
        System.out.println("Звучит гитара");
    }
}
