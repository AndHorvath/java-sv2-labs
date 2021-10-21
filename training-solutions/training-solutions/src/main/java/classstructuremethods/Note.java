package classstructuremethods;

public class Note {

    private String author;
    private String topic;
    private String text;

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) { this.author = author; }

    public String getTopic() { return this.topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getText() { return this.text; }
    public void setText(String text) { this.text = text; }

    public String getNoteText() {
        String noteText = author + ":" + " (" + topic + ") " + text;
        return noteText;
    }
}