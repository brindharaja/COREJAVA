import java.util.*;
public class Book {
    String title;
    String author;
    Book(){
        this.title="Harry Potter";
        this.author="J.K.Rowling";
    }
    public void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
    public static void main(String[] args){
        Book book=new Book();
        book.display();
    }
}
