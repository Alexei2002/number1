class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author.getFullName() + " (Published in " + publicationYear + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Author
        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("Jane", "Smith");

        // Создаем объекты класса Book
        Book book1 = new Book("Sample Book 1", author1, 2020);
        Book book2 = new Book("Sample Book 2", author2, 2018);

        // Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);
    }
}