package ua.goit.java.file;

public abstract class File {
    private String name;
    private String format;
    private long size;

    public File(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSize() {
        return size;
    }

    public void write() {
        System.out.println("Записать файл");
    }

    public void read() {
        System.out.println("Прочитать файл");
    }

    public abstract String getAttributes();

    public abstract boolean isBinary();
}
