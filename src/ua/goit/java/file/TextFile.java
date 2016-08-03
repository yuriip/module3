package ua.goit.java.file;

public class TextFile extends File {

    public TextFile(String name, String format) {
        super(name, format);
    }

    @Override
    public String getAttributes() {
        return "Hidden, System";
    }

    @Override
    public boolean isBinary() {
        return false;
    }
}
