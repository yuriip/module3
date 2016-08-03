package ua.goit.java.task1;

import java.util.ArrayList;

public class Directory {
    private String name;
    private ArrayList<File> files;

    public Directory() {
    }

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        if (files == null) {
            files = new ArrayList<>();
        }
        files.add(file);
    }

    public void listFiles() {
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName() + "." + f.getFormat());
            }
        }
    }
}
