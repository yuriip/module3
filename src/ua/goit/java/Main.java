package ua.goit.java;

import ua.goit.java.file.*;

public class Main {

    public static void main(String[] args) {

        Directory dir = new Directory("mydir");

        dir.addFile(new TextFile("readme", "txt"));
        dir.addFile(new TextFile("about", "txt"));
        dir.addFile(new AudioFile("song", "mp3"));
        dir.addFile(new ImageFile("sun", "jpeg"));

        dir.listFiles();
    }
}
