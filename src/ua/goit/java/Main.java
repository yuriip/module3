package ua.goit.java;

import ua.goit.java.file.*;
import ua.goit.java.flowers.*;

public class Main {

    public static void main(String[] args) {
        processFiles();
        processFlowers();
        processBush();
    }

    private static void processFiles() {
        Directory dir = new Directory("mydir");

        dir.addFile(new TextFile("readme", "txt"));
        dir.addFile(new TextFile("about", "txt"));
        dir.addFile(new AudioFile("song", "mp3"));
        dir.addFile(new ImageFile("sun", "jpeg"));

        dir.listFiles();
    }

    private static void processFlowers() {
        Bouquet mixedBouquet = new Bouquet("Букет с разными цветами", new AstraFlower("Астра", "оранжевая"));
        mixedBouquet.addFlower(new DaisyFlower("Ромашка", "белая"));
        mixedBouquet.addFlower(new RoseFlower("Роза", "красная"));
        mixedBouquet.addFlower(new TulipFlower("Тюльпан", "желтый"));
        mixedBouquet.addFlower(new TulipFlower("Тюльпан", "розовый"));

        mixedBouquet.listFlowers();
    }

    private static void processBush() {
        RoseBush roseBush = new RoseBush("Куст розовый, обыкновенный");
        roseBush.addFlower(new RoseFlower("красный"));
        roseBush.addFlower(new RoseFlower("красный"));
        roseBush.addFlower(new RoseFlower("красный"));

        System.out.println(roseBush.getName() + ". Количество цветов:" + roseBush.getNumFlowers());
    }
}
