package ua.goit.java.flowers;

public class DaisyFlower extends Flower {
    public DaisyFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void formed() {
        System.out.println("Формируется ромашка");
    }

    @Override
    public void smell() {
        System.out.println("Ромашка пахнет немного специфически");
    }
}
