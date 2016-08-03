package ua.goit.java.flowers;

public class TulipFlower extends Flower {
    public TulipFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void formed() {
        System.out.println("Формируется тюльпан");
    }

    @Override
    public void smell() {
        System.out.println("Тульпан пахнет очень слабо");
    }
}
