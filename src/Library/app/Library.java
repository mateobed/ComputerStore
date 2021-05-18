package Library.app;

import Library.model.Book;
import jdk.swing.interop.SwingInterOpUtils;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,296,"Greg", "12345");
        Book book2 = new Book("Jądro ciemności", "Joseph Conrad", 2005, 390, "PWN", "678910");


        System.out.println(appName);

        System.out.println("Książki dostępne w bibliotece: ");
        book1.setTitle("Harry Potter");
        book1.printInfo();
    }
}
