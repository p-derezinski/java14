package pl.sdacademy.java14poz.wlasneprogramy;

public class Message {

    private String sender;
    private String messageTitle;
    private String messageText;
    private boolean read;

    public Message(String sender, String messageTitle, String messageText) {
        this.sender = sender;
        this.messageTitle = messageTitle;
        this.messageText = messageText;
        this.read = false;
    }

    public String toString() {
        return "\t- From: " + sender +
                "\n\t- Title: " + messageTitle.toUpperCase() +
                "\n\t- Text: " + messageText;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
