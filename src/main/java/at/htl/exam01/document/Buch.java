package at.htl.exam01.document;

public class Buch extends Objekte {

    String author, titel;


    public Buch(String author, String titel) {
        this.author = author;
        this.titel = titel;
    }

    @Override
    public String output() {
        String output = "Book:  '" + titel + "' von '" + author + "'" ;
        return output;
    }


}
