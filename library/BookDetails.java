package library;

public class BookDetails {
    String bookName;
    String author;
    int availableCopies;
    int totalCopies;

    public BookDetails(String bookName,String author, int availableCopies, int totalCopies) {
        this.bookName = bookName;
        this.author = author;
        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
    }
}
