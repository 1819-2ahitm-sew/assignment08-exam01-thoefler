package at.htl.exam01.document;

public class Book extends Document {

    String author, title;


    public Book(String author, String titel) {
        this.author = author;
        this.title = titel;
    }

    @Override
    public String output() {
        String output = "Book:  '" + title + "' von '" + author + "'" ;
        return output;
    }


}
