package at.htl.exam01.document;

public class Email extends Document {

    String subject, to;


    public Email(String author, String subject, String to) {

        super(author);
        this.subject = subject;
        this.to = to;
    }

    @Override
    public String output() {
        return "Email: '" + subject +  "' an '" + to + "'";
    }

}
