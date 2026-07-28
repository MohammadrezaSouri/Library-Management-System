package Service;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final static List<Book> books = new ArrayList<>();

    public List<Book> getBooks(){
        return new ArrayList<>(books);
    }
    public void addBook(Book book){
        books.add(book);
    }
    public Book getBook(int index){
        return books.get(index);
    }
    public Book findBookByTitle(String title){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public boolean removeBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

}
