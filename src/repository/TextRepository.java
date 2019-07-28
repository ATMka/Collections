package repository;

public class TextRepository {
    public TextRepository(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }
}
