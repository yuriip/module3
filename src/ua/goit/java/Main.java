// Написать классы на Java соответствующие UML диаграммам из задания к Модулю 2.
// Создать проект с исходниками и загрузить его на GitHub.

package ua.goit.java;

import ua.goit.java.task1.Directory;
import ua.goit.java.task1.File;
import ua.goit.java.task1.TextFile;

public class Main {

    public static void main(String[] args) {

        // task1
        Directory dir = new Directory("mydir");
        File textFile1 = new TextFile("readme", "txt");
        File textFile2 = new TextFile("about", "txt");
        File audioFile = new TextFile("song", "mp3");
        File imageFile = new TextFile("sun", "jpeg");

        dir.addFile(textFile1);
        dir.addFile(textFile2);
        dir.addFile(audioFile);
        dir.addFile(imageFile);

        dir.listFiles();
    }
}
