package ua.goit.java.music;

public abstract class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Начать играть на музыкальном инструменте");
    }

    public void end() {
        System.out.println("Закончить играть на музыкальном инструменте");
    }

    public abstract void play();

    public abstract void sound();
}
