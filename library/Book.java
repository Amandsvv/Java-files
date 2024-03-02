package library;

public class Book{

    int Scholar_id;
    String Student_name;
    BookDetails Books;

    public Book(int Scholar_id,String Student_name){
        this.Scholar_id = Scholar_id;
        this.Student_name = Student_name;
        this.Books = null;
    }
    public void update(int ch, BookDetails Books){
        this.Books = Books;
        int a;
        StatusUpdate s = new StatusUpdate();
        if(ch == 1 && Books.availableCopies != 0){
            a = s.borrow(Books.availableCopies);
            Books.availableCopies = a;
            display();
            System.out.println("Status  :  Successfully Borrowed");
        }else if(ch == 2 && Books.availableCopies != 10){
            a = s.returnBook(Books.availableCopies);
            Books.availableCopies = a;
            display();
            System.out.println("Status  :  Successfully Returned");
        }
        else if(Books.availableCopies == 0){
            System.out.println("Book is not available");
        }else if(Books.availableCopies == 10){
            System.out.println("Book is not being borrowed");
        }else{
            System.out.println("Something Diffrent");
        }
    }
    public void display() {
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Bill ID: " +this.Scholar_id);
        System.out.println("Customer Name: " + this.Student_name);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Book Name     | Author      | TotalCopies  | AvailableCopies ");
        System.out.println(Books.bookName + "        " + Books.author +"        " +Books.totalCopies + "        "+Books.availableCopies);
        System.out.println("--------------------------------------------------------------");
    }

}