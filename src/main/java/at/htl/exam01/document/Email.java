package at.htl.exam01.document;

public class Email extends Document {

    String sender, subject, to;

    public Email(String sender, String betreff, String empfaenger) {
        this.sender = sender;
        this.subject = betreff;
        this.to = to;
    }

    @Override
    public String output() {
        String output = "Email: '" + subject + "' von '" + sender + "' an '" + to + "'";
        return output;
    }

}
