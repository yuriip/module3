package ua.goit.java.file;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
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
