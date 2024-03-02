import library.*;
import java.util.*;

public class LibraryManagmentSystem {
    public static void main(String[] args) {
      BookDetails book =  new BookDetails("The Mice","Robert Forst" , 10, 10);
      Book student1 = new Book(2224006,"Aman Kumar");
      Scanner sc = new Scanner(System.in);
      int ch ;
      do{
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter 1 to borrow the book\nEnter 2 to return the book\nEnter 3 to Exit");   
        ch = sc.nextInt();
        student1.update(ch,book);
    }while(ch != 3);
    }
}
