package ua.goit.java;

import ua.goit.java.file.*;
import ua.goit.java.flower.*;
import ua.goit.java.music.Guitar;
import ua.goit.java.music.MusicalShop;
import ua.goit.java.music.Piano;
import ua.goit.java.music.Trumpet;

public class Main {

    public static void main(String[] args) {
        processFiles();
        processFlowers();
        processBush();
        processMusicalShop();
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

    private static void processMusicalShop(){
        MusicalShop musicalShop = new MusicalShop("Все для музыки");

        musicalShop.addMusicalInstrument(new Guitar("Электро гитара"));
        musicalShop.addMusicalInstrument(new Guitar("Акустическая гитара"));
        musicalShop.addMusicalInstrument(new Piano("Классическое фортепианино"));
        musicalShop.addMusicalInstrument(new Trumpet("Труба"));

        System.out.println("Магазин \"" + musicalShop.getName() + "\"");
        System.out.println("Каталог музыкальных инструментов:");
        musicalShop.listMusicalInstrument();
    }
}
