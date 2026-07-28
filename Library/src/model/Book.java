package model;


public class Book {
    private final String Title;
    private final String Topic;
    private final String Writer;
    private final int Pages;
    private String State;


    public String getTitle() {
        return Title;
    }

    public int getPages() {
        return Pages;
    }

    public String getWriter() {
        return Writer;
    }

    public String getTopic() {
        return Topic;
    }

    public String getState() {
        return State;
    }

    public Book setState(String state) {
         if (state != null && !state.trim().isEmpty()) {
             State = state;
         }
         return this;
    }

    public Book(String title, String topic, String writer, int pages) {
        Title = title;
        Topic = topic;
        Writer = writer;
        Pages = pages;
        State = "Unread";
    }
    @Override
    public String toString() {
        return
                "Title : " + getTitle() +
                "\nTopic : " + getTopic() +
                "\nWriter : " + getWriter() +
                "\nPages : " + getPages() +
                "\nState : " + getState();
    }

}
