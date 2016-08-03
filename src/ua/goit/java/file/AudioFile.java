package ua.goit.java.file;

public class AudioFile extends File {

    public AudioFile(String name, String format) {
        super(name, format);
    }

    @Override
    public String getAttributes() {
        return "Read-only";
    }

    @Override
    public boolean isBinary() {
        return true;
    }
}
