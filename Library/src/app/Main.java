package app;

import Service.Library;
import model.Book;

import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;
        while (!exit) {
            IO.println("Welcome dear User");
            IO.println("********************************");
            IO.println("1- Change State");
            IO.println("2- Add Book");
            IO.println("3- Delete Book");
            IO.println("4- List Books");
            IO.println("5- Exit Program");
            IO.println("********************************");
            IO.print("please choose one option : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    IO.print("Please enter the book title : ");
                    String Choose_title = scanner.nextLine();
                    IO.print("Enter your new State (Read/Reading/UnRead) : ");
                    String state = scanner.nextLine();

                    Book State_book = library.findBookByTitle(Choose_title);

                    if (State_book != null) {
                        State_book.setState(state);
                        IO.println("State successfully changed");
                    }
                    else {
                        IO.println("Book not found");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    IO.print("Please enter the book title : ");
                    String add_title = scanner.nextLine();
                    IO.print("Please enter the book Writer : ");
                    String writer = scanner.nextLine();
                    IO.print("Please enter the book Topic : ");
                    String topic = scanner.nextLine();
                    IO.print("Please enter the book Pages : ");
                    int pages = scanner.nextInt();

                    Book add_book = new Book(add_title, topic, writer, pages);
                    library.addBook(add_book);
                    IO.println("Book added successfully");
                    break;
                case 3:
                    scanner.nextLine();
                    IO.print("Please enter the book title : ");
                    String Remove_title = scanner.nextLine();

                    if (library.removeBookByTitle(Remove_title)) {
                        IO.println("Book removed successfully");
                    }
                    else {
                        IO.println("Book not found");
                    }
                    break;
                case 4:
                    List<Book> ListOfBooks = library.getBooks();
                    if (ListOfBooks.isEmpty()){
                        IO.println("There are no Books in the Library");
                    }
                    else {
                        for (int i = 0; i < ListOfBooks.size(); i++) {
                            IO.println("Books #" + (i + 1) + ":");
                            IO.println(ListOfBooks.get(i).toString());
                        }
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    IO.println("Wrong choice please try again");
            }
        }
        scanner.close();
        IO.println("Thanks for choosing our console app");
    }
}
