package at.htl.exam01.document;

public abstract class Document {


    private String author = "";

    public Document() {
    }

    public Document(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String output();

}
