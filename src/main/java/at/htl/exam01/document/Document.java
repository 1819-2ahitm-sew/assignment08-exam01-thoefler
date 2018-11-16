package at.htl.exam01.document;

public abstract class Document {

    static Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
    static Book book2 = new Book("Tolkoen", "lordOfTheRings");
    static Email email = new Email("Susi", "Bewerbung", "CoolCompany");

    static Document[] documents = new Document[]{book, book2, email};

    public abstract String output();

}
