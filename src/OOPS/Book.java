package OOPS;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    private BookType bookType;

    public Book(String title,String author,String ISBN ,BookType bookType )
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.isAvailable=true;
        this.bookType=bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void read()
    {
        this.bookType.readBook();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
