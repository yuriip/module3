package ua.goit.java.file;

public class ImageFile extends File {
    public ImageFile(String name, String format) {
        super(name, format);
    }

    @Override
    public String getAttributes() {
        return "Archive, Read-only";
    }

    @Override
    public boolean isBinary() {
        return true;
    }
}
